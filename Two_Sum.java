
public class Two_Sum {

	public int[] twoSum(int[] nums, int target) {
		int n1 = 0, n2 = 0, temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					n1 = i;
					n2 = j;
					break;
				}

			}
		}
		int[] indices = { n2, n1 };
		return indices;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
