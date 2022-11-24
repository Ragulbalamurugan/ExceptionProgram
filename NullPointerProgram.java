package Exeception;

public class NullPointerProgram {
	
	public static void main(String[] args) {
		try {
		System.out.println("Start the program");
		String name = null;
		
		int a = name.length();
		System.out.println(a);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		
		System.out.println("Stop the program");
		
	}

}
