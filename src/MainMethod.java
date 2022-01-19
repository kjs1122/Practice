import java.util.*;

public class MainMethod {

	public static String[] test(String a, String b) {
		String result1 = null;
		String result2 = null;
		if(a.toUpperCase().equals(a)) {
			result1 = a.toLowerCase();
		} else {
			result1 = a.toUpperCase();
		}
		if(b.toUpperCase().equals(b)) {
			result2 = b.toLowerCase();
		} else {
			result2 = b.toUpperCase();
		}
		
		
		
		
		return new String[] {result1,result2};
	}
	
	public static void main(String[] args) {
		
		
		String[] result = test("USA","ssss");
		
		System.out.println(Arrays.toString(result));

	
	}
}
