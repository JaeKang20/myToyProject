package 중급;

public class myCalculation implements calculration {

	@Override
	public int plus(int a, int b) {		
		int c = a+b;
		System.out.println(c);
		return c;
	}

	@Override
	public int minus(int a, int b) {
		int c = a-b;
		System.out.println(c);
		return c;
	}

	@Override
	public int multiply(int a, int b) {
		int c = a*b;
		System.out.println(c);
		return c;

	}

	@Override
	public int division(int a, int b) {
		int c = a/b;
		System.out.println(c);
		return c;
	}

}
