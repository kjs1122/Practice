import java.util.*;
import java.util.stream.*;

public class StreamExample {

	
	public static void main(String args[]) {
	List<String> list = Arrays.asList("È«±æµ¿", "½Å¿ë±Ç", "±èÀÚ¹Ù");
			
			
	Stream<String> stream = list.stream();
	stream.forEach(name -> System.out.println(name));
	
	}
	
}
