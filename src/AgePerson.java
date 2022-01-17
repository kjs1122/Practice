import java.util.*;

public class AgePerson implements Comparable<AgePerson>{

	public String name;
	public int age;
	public AgePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(AgePerson o) {
		if(age < o.age) return -1;
		else if (age == o.age) return 0;
		else return 1;
	}
	
	public static void main(String[] args) {
		
		
	}
}
