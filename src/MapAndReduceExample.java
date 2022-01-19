import java.util.*;

public class MapAndReduceExample {

	public static void main(String args[]) {
		List<Student> list = Arrays.asList(
				new Student("김지수", 10),
				new Student("김만수", 20),
				new Student("김자수", 30)
			);
				
		
		double avg = list.stream()
				//중간 처리 학생 객체를 점수로 매핑
				.mapToInt(Student :: getScroe)
				//최종 처리(평균 점수)
				.average()
				.getAsDouble();
		
		System.out.println(avg);
				
	}
}
