import java.util.*;
import java.util.stream.*;

public class LamdaExpressionExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 90),
			new Student("신용권", 92)
		);

		
		Stream<Student> stream = list.stream();
		
		stream.forEach( s -> {
			System.out.printf(s.getName());
			System.out.print(s.getScroe());
		});
		
		
	}

}
