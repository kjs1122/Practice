
public class ButtonExample {

	
	
	public static void main(String args[]) {
		
		Button button = new Button();
		
		button.setListener(new CallListener());
		button.setListener(new MessageListener());
		button.touch();
	}
}
