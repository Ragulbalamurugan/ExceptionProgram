package Exeception;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionClass {
	public static void main(String[] args) throws IOException {
		try {
		File file = new File("D:\\JavaPractice\\InpuOutput.txt");
		
		FileReader fileReader = new FileReader(file);
	
		
		int temp = 0;
		while((temp = fileReader.read() )!= -1){
			System.out.print((char) temp);
		}
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
