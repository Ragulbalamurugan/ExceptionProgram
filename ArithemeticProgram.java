package Exeception;

public class ArithemeticProgram {
	public static void main(String[] args) {
		System.out.println("Start the Program");
		try {
			int a = 10;
			int b = 0;

			int c = a / b;

			System.out.println(c);
		} catch (ArithmeticException e) {
			
			//System.out.println(e);
			
			e.printStackTrace();

		}
		System.out.println("End the program");
	}

}
