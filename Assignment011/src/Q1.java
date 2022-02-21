import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class Q1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar now = Calendar.getInstance();
		String time = sdf1.format(now.getTime());
		
		
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for (int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i]; //i=4�� ��� ���� �߻�
				System.out.println("intArray["+i+"]" + "=" + intArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�."+ time);
			System.out.println(e.getMessage());	
			try {
				FileWriter log = new FileWriter("c:\\log\\"+ time + ".log");
				log.write(e.getMessage(),0,e.getMessage().length());
				log.close();
				
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
		}

	}

}
