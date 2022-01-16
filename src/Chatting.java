
public class Chatting {
	void startChat(String chatid) {
		String nickName = chatid;
		Chat chat = new Chat() {
			public void start() {
				while(true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
		};
		chat.start();
		
	}
	
	
	class Chat{
		void start() {};
		void sendMessage(String message) {
			System.out.println(message);
		};
	}
	public static void main(String args[]) {
		Chatting c = new Chatting();
		
		c.startChat("sss");
	
	}
}
