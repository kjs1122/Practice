import java.util.*;
import java.util.stream.*;

public class LamdaExpressionExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90),
			new Student("�ſ��", 92)
		);

		
		Stream<Student> stream = list.stream();
		
		stream.forEach( s -> {
			System.out.printf(s.getName());
			System.out.print(s.getScroe());
		});
		
		
	}

}
