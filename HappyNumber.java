import java.util.ArrayList;
import java.util.List;

class HappyNumber {

	// int digitSquareSum(int n) {
	// int sum = 0, tmp;
	// while (n > 0) {
	// tmp = n % 10;
	// sum += tmp * tmp;
	// n /= 10;
	// }
	// return sum;
	// }
	//
	// boolean isHappy(int n) {
	// int slow, fast;
	// slow = fast = n;
	// do {
	// slow = digitSquareSum(slow);
	// fast = digitSquareSum(fast);
	// fast = digitSquareSum(fast);
	// } while(slow != fast);
	// if (slow == 1) return true;
	// else return false;
	// }

	public static List<Integer> returnDigits(int n) {
		List<Integer> digits = new ArrayList<Integer>();
		while (n == 0) {
			digits.add(n % 10);
			n = n / 10;
		}
		return digits;
	}

	public static int sum(List<Integer> list) {
		Integer sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		int s = Integer.valueOf(sum);
		return s;
	}

	public boolean isHappy(int n) {
		if (n == 1 || (n % 10) % 10 == 0) {
			return true;
		} else {
			List<Integer> digits = returnDigits(n);
			int sum = sum(digits);

			return isHappy(sum);
		}
	}

	public static void main(String[] args) {

	}

}
