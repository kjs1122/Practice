
public class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("��Ƽ ������");
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			
			System.out.println("��Ƽ ������");
				
		});
	}

}
