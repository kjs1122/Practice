import java.awt.*;

public class BeppPrintExample1 {

	
	public static void main(String args[]) {
		Runnable task = new BeepTask();
		Thread thread = new Thread(task);
		
		thread.start();
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
}
