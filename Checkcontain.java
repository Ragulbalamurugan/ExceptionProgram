package Exeception;

public class Checkcontain {
	public static void main(String[] args)  throws StringException  {
		try {
		String name = "Ragulbalamurugan";
		
		if(name.length() > 6) {
			
			throw new StringException("name is to long") ;
		}
		else {
			System.out.println(name + " is perfect");
		}
		}
		catch(StringException e) {
			e.printStackTace();
		}
		
	}

}

class StringException extends Exception {
	public StringException(String a) {
		
		super(a);
	}
	public void printStackTace() {
		System.out.println("Error occurs");
	}
}
