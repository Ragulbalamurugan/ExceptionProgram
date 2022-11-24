package Exeception;

public class ExceptionTask {
	public static void main(String[] args) {
		System.out.println("Starts");

		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			// System.out.println("Error occur");

			e.printStackTrace();

		}
		finally {
			System.out.println("Executing important details");
		}

		System.out.println("ends");

	}

}
