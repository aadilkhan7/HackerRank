import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection_of_Two_Array {

	public static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> al = new ArrayList<Integer>();
		int l1 = nums1.length, l2 = nums2.length;
		if (l1 == 0 || l2 == 0) {

		} else if (l1 == l2) {
			Arrays.sort(nums1);// NUMS1 Sorted
			for (int i = 0; i < l1; i++) {
				int k = Arrays.binarySearch(nums1, nums2[i]);
				if (k >= 0) {
					nums1[i] = -1;
					Arrays.sort(nums1);
					al.add(nums2[i]);
				}
			}
		} else {
			int[] smaller = l1 < l2 ? nums1 : nums2;
			int[] larger = l1 > l2 ? nums1 : nums2;
			Arrays.sort(larger);// Larger Sorted
			for (int i = 0; i < smaller.length; i++) {
				int k = Arrays.binarySearch(larger, smaller[i]);
				if (k >= 0) {
					larger[k] = -1;
					Arrays.sort(larger);
					al.add(smaller[i]);
				}
			}

		}

		int[] intersec = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			intersec[i] = al.get(i);
		}

		return intersec;
	}

	public static void main(String[] args) {
		int[] n1 = { 1, 2, 2, 1 };
		int[] n2 = { 1, 1 };
		int[] ans = intersect(n1, n2);

		for (int i : ans) {
			System.out.print(i + ",");
		}
	}

}
