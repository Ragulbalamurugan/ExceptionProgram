package Exeception;

public class Hierarchy {
	public static void main(String[] args) {

		System.out.println("Start the program");
		try {
			String a = "rt4";
			int b = Integer.parseInt(a);

			System.out.println(b);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NumberFormatException rs) {
			System.out.println(rs);
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
