import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; //Ÿ�̸� ���� ��µ� ���̺�
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; // �� ī��Ʈ�� ����� ���̺�
	}
	
	// �������ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n=0; //Ÿ�̸� ī��Ʈ ��
		while(true) { // ���ѷ���
			timerLabel.setText(Integer.toString(n)); // ���̺� ī��Ʈ �� ���
			n++; // ī��Ʈ ����
			try {
				Thread.sleep(1000);// 1�ʵ��� ���� �ܴ�.
			} 
			catch (InterruptedException e) {
				return; // ���ܰ� �߻��ϸ� ������ ����
			} 
		}
	}
}

	public class RunnableTimerEx extends JFrame {
		public RunnableTimerEx() {
			this.setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = this.getContentPane();
			c.setLayout(new FlowLayout());
			
			//Ÿ�̸� ���� ����� ���̺� ����
			JLabel timerLabel = new JLabel();
			timerLabel.setFont(new Font("Gothic", Font.ITALIC, 88));
			c.add(timerLabel); // ���̺��� ����Ʈ�ҿ� ����
			
			//Ʈ�̸� ������� ����� Runnable ��ü ���� . Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
			TimerRunnable runnable = new TimerRunnable(timerLabel);
			Thread th = new Thread(runnable); // ������ ��ü ����
			
			this.setSize(250, 150);
			this.setVisible(true);
			
			th.start(); // Ÿ�̸� �����尡 ������ �����ϰ� �Ѵ�.
		}


	public static void main(String[] args) {
		new RunnableTimerEx();

	}

}
