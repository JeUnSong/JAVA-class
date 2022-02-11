import java.io.*;
public class BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("C:\\Windows\\Web\\Screen\\img103.png");// ���� ���� ��θ�
		
		File dest = new File("c:\\Temp\\mama.png"); // ���� ���� ��θ�
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); // ���� �Է� ����Ʈ ��Ʈ�� ����
			FileOutputStream fo = new FileOutputStream(dest); // ���� ��� ����Ʈ ��Ʈ�� ����
			
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+"�� " + dest.getPath()+ "�� �����Ͽ����ϴ�.");
		}catch (IOException e) {
			System.out.println("���� ���� ����");
		}

	}

}
