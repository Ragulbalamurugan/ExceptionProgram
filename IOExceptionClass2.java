package Exeception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionClass2 {
	public static void main(String[] args) throws IOException {
		try {
		File files = new File("D:\\Email.txt");
		
		FileReader fileReaders = new FileReader(files);
		
		int value = 0;
		while((value = fileReaders.read()) != -1) {
			System.out.print((char) value);
		}
		}catch(Exception e) {
			//e.printStackTrace();
			System.err.println("Input is not match with userDetails");
		}
		
	}

}
