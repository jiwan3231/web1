package Test_A;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("c:/Temp/test9.txt");
		
		char[] array = {'A','B','C','D','E'};
		
		writer.write(array,1,3);
		
		writer.flush();
		writer.close();
		
		
		
	}

}
