
public class Account {
	
	private long balance;

	public void setBalance(int balance) {
		this.balance = balance;			
	}
	
	
	public void withdraw(int money) throws BalaneException {
		if(money > balance) {
			throw new BalaneException("�ܾ��� �����մϴ�");
		}
	}
	
}
