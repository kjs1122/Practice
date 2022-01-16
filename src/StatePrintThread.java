
public class StatePrintThread extends Thread {

	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태 : " + state);
			
		if(state == Thread.State.NEW) {
			targetThread.start();
		} else if (state == Thread.State.TERMINATED) {
			break;
		}
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		}
	}
	
	

}
