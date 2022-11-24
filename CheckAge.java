package Exeception;

public class CheckAge {
	public static void main(String[] args) throws AgeException {
		try {
			int age = 19;

			System.out.println("Start the program");
			if (age < 18) {
				throw new AgeException("not eligible");
			} else {
				System.out.println("Eligible to vote");

			}

		} catch (AgeException e) {
			System.out.println(e);
		}
		System.out.println("End Program");
	}

}

class AgeException extends Exception {
	public AgeException(String a) {
		super(a);
	}
}