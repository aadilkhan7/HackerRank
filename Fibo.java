
public class Fibo {

	static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);

	}

	public static void main(String[] args) {
		int ans = fib(7);
		System.out.println(ans);

	}

}
