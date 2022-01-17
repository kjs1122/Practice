import java.util.*;

public class WildCardExample {

	public static void registerCoures(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String args[]) {
		
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
			personCourse.add(new Person());
	}
}
