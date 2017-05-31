import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number_Counter {

	public static List<Integer> topKFrequent(int[] nums, int k) {

		List<Integer>[] bucket = new List[nums.length + 1];
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

		for (int n : nums) {
			frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
		}
		System.out.println(frequencyMap);
		System.out.println(frequencyMap.keySet());

		for (int key : frequencyMap.keySet()) {
			int frequency = frequencyMap.get(key);
			if (bucket[frequency] == null) {
				bucket[frequency] = new ArrayList<>();
			
			bucket[frequency].add(key);
		}

		List<Integer> res = new ArrayList<>();

		for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
			if (bucket[pos] != null) {
				res.addAll(bucket[pos]);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] input = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		System.out.println(topKFrequent(input, k));
	}

}