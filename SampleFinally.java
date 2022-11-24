package Exeception;

public class SampleFinally {
	public static void main(String[] args) {
		try {
			System.out.println("Starts");
			int a = 5;
			int b = 0;
			int c = a / b;

			System.out.println(c);

		} finally {

			System.out.println("Ends");
		}

	}

}
