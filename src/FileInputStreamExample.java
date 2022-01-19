import java.io.*;

public class FileInputStreamExample {

	public static void main(String args[]) {
		
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\workspace\\prworkspace\\Practice\\src\\Student.java");
			byte[] b = new byte[1];
			int numRead = 0;
			
			while((numRead = fis.read()) != -1 ) {
				System.out.println(numRead);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
