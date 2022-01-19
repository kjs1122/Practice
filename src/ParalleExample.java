import java.util.*;
import java.util.stream.*;

public class ParalleExample {

	public static void print(String str) {
		System.out.println(str+ " : " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "������", "��ο�");
		
		Stream<String> stream =  list.stream();
		stream.forEach(ParalleExample :: print);
		
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach( s -> print(s));

	}

}
