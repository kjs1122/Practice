
public class ProductExample {

	public static void main(String args[]) {
	Product<Tv, String> product1 = new Product<>();
	
	product1.setKind(new Tv());
	product1.setModel("����ƮTV");
	
	Tv tv = product1.getKind();
	String tvModel = product1.getModel();
	
	
	
	
	}
}
