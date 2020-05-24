package Test_A;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test_0519 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		
	}
	
	public static void write(String str) throws Exception{
		
			FileOutputStream fos = new FileOutputStream("c:/Temp/test1.txt");
			Writer write = new OutputStreamWriter(fos);
			
			writer.write(str);
			writer.flush();
			writer.close();
		
			
		}
	}

}
