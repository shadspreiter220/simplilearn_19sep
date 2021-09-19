package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExternalOutpuDemo {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/home/idaholibaol/Desktop/Output");
		
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.print("Today is Saturday");
		printWriter.close();
		
		
		
		
		
		
		
		
	}

}
