import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

	public class Q1 extends JFrame implements Runnable {
		private JLabel timerlabel;
		private Thread thread;
		 
		public Q1() {
			this.setTitle("���� �ð�");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			
			timerlabel = new JLabel();
			timerlabel.setFont(new Font("Gothic", Font.ITALIC, 30));
			
			if(thread == null){
				
				thread = new Thread(this);
		        thread.start();
			}
			this.add(timerlabel);
			
			this.setSize(500,100);
			this.setVisible(true);	
			
		}

	public static void main(String[] args) {
		new Q1();
	}
	
	@Override
	public void run() {
		while(true) {
		Calendar cal = Calendar.getInstance();
		String now = cal.get(Calendar.YEAR)+"�� "+
				    (cal.get(Calendar.MONTH)+1)+"�� "+
					 cal.get(Calendar.DAY_OF_MONTH)+"�� "+
					 cal.get(Calendar.HOUR)+"�� "+ 
					 cal.get(Calendar.MINUTE)+"�� "+
					 cal.get(Calendar.SECOND)+"��";
				timerlabel.setText(now);
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
  }
}
