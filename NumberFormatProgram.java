package Exeception;

public class NumberFormatProgram {
	public static void main(String[] args) {
		System.out.println("Start the program");
		
		System.out.println();
		try {
		String ab = "abv45";
		int a = Integer.parseInt(ab);
		System.out.println(a);
		}catch(NumberFormatException e) {
			//e.printStackTrace();
			System.err.println("NumberFormatError");
		}
		System.out.println();
		System.out.println("End the program");
		 
	}

}
