import java.io.*;
public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("C:\\Windows\\Web\\Screen\\img103.png");
		
		File dest = new File("c:\\Temp\\song.png"); // ��������
		try {
			FileInputStream fi = new FileInputStream(src); // ���� �Է� ����Ʈ ��Ʈ��
			FileOutputStream fo = new FileOutputStream(dest); // ���� ��� ����Ʈ ��Ʈ��
			byte [] buf = new byte [1024*10]; // 10KB ����
			while(true) {
				int n = fi.read(buf); // ���� ũ�⸸ŭ �б�. n�� ���� ���� ����Ʈ
				fo.write(buf, 0, n); // buf[0]���� n ����Ʈ ����
				if(n < buf.length)
					break; // ���� ũ�⺸�� �۰� �о��� ������ ���� ���� ����. ��������
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}

	}

}
