
public class Util {

	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	public static <T, V> Pair<T,V> pair(T t ){
		Pair<T, V> pair = null;
		return null;
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p2.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	public static void main(String args[]) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		
		
	}

	
	public static <T extends Number> int compara(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t1.doubleValue();
		
		
		
		return Double.compare(v2, v2);
	}
}
