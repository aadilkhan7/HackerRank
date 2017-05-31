
public class NumberOf1Bits {

	public int hammingWeight(int n) {

		int a = 0x0001, count = 0;
		for (int i = 0; i < 32; i++) {
			if ((a & n) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

	public static void main(String[] args) {

	}

}
