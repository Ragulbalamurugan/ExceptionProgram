package Exeception;

public class StringIndexOutProgram {
	
	public static void main(String[] args) {
	
		try {
		System.out.println("Start the program");
		
		String name = "Ragul";
		char a = name.charAt(8);
		
		System.out.println(a);
		
				}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		System.out.println("Stop the prorgam");

	}

}
