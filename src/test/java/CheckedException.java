public class CheckedException {
	public int division(int a, int b) {
		/*
		 * if(b<1) throw new ArithmeticException("Not Eligible for division");
		 */

		int t = a / b;
		return t;
	}

	public void checkAge(int age) {
		if (age < 18)
			throw new ArithmeticException("Not Eligible for voting");
		else
			System.out.println("Eligible for voting");
	}

	public static void main(String args[]) throws ArithmeticException {
		CheckedException obj = new CheckedException();
		try {
			obj.checkAge(13);
		} catch (ArithmeticException e) {
			System.out.println("catching Exception");
		}
	}
}