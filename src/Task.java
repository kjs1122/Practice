
public class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("멀티 스레드");
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			
			System.out.println("멀티 스레드");
				
		});
	}

}
