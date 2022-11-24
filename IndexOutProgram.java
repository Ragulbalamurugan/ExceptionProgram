package Exeception;

public class IndexOutProgram {
	public static void main(String[] args) {

		try {
			int a[] = { 1, 2, 3, 4, 5, 6 };
			System.out.println("Start the program");

			System.out.println(a[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		System.out.println("End the program");
	}

}
