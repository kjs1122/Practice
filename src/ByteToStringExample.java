import java.text.*;
import java.util.*;

public class ByteToStringExample {
	
	
	public static void main(String args[]) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy≥‚MMø˘DD¿œ");
		
		System.out.println(sdf.format(now));
	}

}
