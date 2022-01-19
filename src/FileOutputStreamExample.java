import java.io.*;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\workspace\\prworkspace\\Practice\\src\\Student.java");
			FileOutputStream fos = new FileOutputStream("C:\\workspace\\prworkspace\\Practice\\src\\test.txt");
			
			byte b[] = new byte[4096];
			int numRead;
			
			while((numRead = fis.read(b)) != -1) {
				fos.write(b,0,numRead);
			}
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
