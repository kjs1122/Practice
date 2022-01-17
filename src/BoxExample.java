
public class BoxExample {

	
	public static void main(String args[]) {
		Box<String> box1 = new Box<String>();
		box1.set("Hello");
		System.out.println(box1.get());
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(3);
		System.out.println(box2.get());
	}
}
