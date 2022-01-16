
public class DataBox {

	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String returnValue = data;
		System.out.println("Consummer가 읽은 데이터 : " + returnValue);
		notify();
		data = null;
		notify();
		return returnValue;
	
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();
	}
}
