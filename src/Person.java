
public class Person {

	private String name;
	private int age;

	
	

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}



	public static void main(String args[]) {
		
		
		int[] ar1 = {1,2,3,4,5};
		char[] ar2 = {'A','B','C','D','E'};
		Person[] pa = new Person[5];
		pa[0] = new Person("±èÁö¼ö", 30);
		
		
		
		for(int i = 0; i < ar1.length; i++) {
			System.out.print(ar2[i]);
		}
	
		
		
		
		
	}
	
	
	
	
	
}
