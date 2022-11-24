package Exeception;

public class StringLength {
	public static void main(String[] args) throws StringLenghtException {

		String name = "Ragulbalu";

		if (name.length() > 5) {
			throw new StringLenghtException("name is too long");
		} else {
			System.out.println(name + " is perfect");
		}

	}

}

class StringLenghtException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public StringLenghtException(String a) {
		super(a);
	}
}