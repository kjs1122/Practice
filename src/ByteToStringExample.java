import java.text.*;
import java.util.*;

public class ByteToStringExample {
	
	
	public static void main(String args[]) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��DD��");
		
		System.out.println(sdf.format(now));
	}

}
