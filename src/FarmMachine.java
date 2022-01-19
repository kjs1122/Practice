
public class FarmMachine {

	private int price;
	private int productDate;
	private String color;
	private String model;

	public FarmMachine(int price, int productDate, String color, String model) {
		this.price = price;
		this.productDate = productDate;
		this.color = color;
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public int getProductDate() {
		return productDate;
	}

	public String getColor() {
		return color;
	}
	
	public void move() {
		System.out.println( this.model + " is moving");
	}
	public void dig() {
		System.out.println( this.model + " is digging");
	}
	public void grinding() {
		System.out.println( this.model + " is grinding");
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		int c = a + b;
	
		Integer.parseInt("1000",16);
		System.out.println(Integer.parseInt("1000",16));
	}

}
