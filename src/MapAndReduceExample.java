import java.util.*;

public class MapAndReduceExample {

	public static void main(String args[]) {
		List<Student> list = Arrays.asList(
				new Student("������", 10),
				new Student("�踸��", 20),
				new Student("���ڼ�", 30)
			);
				
		
		double avg = list.stream()
				//�߰� ó�� �л� ��ü�� ������ ����
				.mapToInt(Student :: getScroe)
				//���� ó��(��� ����)
				.average()
				.getAsDouble();
		
		System.out.println(avg);
				
	}
}
