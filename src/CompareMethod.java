
public class CompareMethod {

	public static void main(String args[]) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		
		boolean result = Util.compare(p1, p2);
		
	}
}
