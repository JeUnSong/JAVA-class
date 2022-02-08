interface PhoneInterface {
	final int TIMEOUT = 10000; //��� �ʵ� ����
	void sendCall();		   //�߻� �޼ҵ�
	void receiveCall();		   //�߻� �޼ҵ�
	default void printLogo() { //default �޼ҵ�
		System.out.println("** Phone **");
	}

}
interface MobilePhoneInterface extends PhoneInterface { // �������̽� ���
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface { // �������̽� ����
	public void play();
	public void stop();
}
class PDA { // Ŭ���� �ۼ�
	public int calculate(int x, int y) {
		return x + y;
	}
}
