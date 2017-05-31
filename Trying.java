interface A {
	void abc();

	int p();
}

class B implements A {

	@Override
	public void abc() {
		System.out.println("abc method called");

	}

	@Override
	public int p() {
		System.out.println("P method called");
		return 0;
	}

	void pqr() {
		System.out.println("pqr called");
	}

}

public class Trying {

	public static void main(String[] args) {
		A obj = new B();
		obj.abc();
		obj.p();
		((B) obj).pqr();

	}

}
