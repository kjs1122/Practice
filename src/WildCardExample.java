import java.util.*;

public class WildCardExample {

	public static void registerCoures(Course<?> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String args[]) {
		
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
			personCourse.add(new Person());
	}
}
