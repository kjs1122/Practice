import java.awt.*;

public class BeepTask implements Runnable{
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	};

}
