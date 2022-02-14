import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
	public InnerClassListener () {
		this.setTitle("Action �̺�Ʈ ������ ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());                                  
		c.add(btn);
		
		this.setSize(350,150);
		this.setVisible(true);
	}
	// ���� Ŭ������ Action ������ �ۼ�
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource(); // �̺�Ʈ �ҽ� ��ư �˾Ƴ���
			if(b.getText().equals("Action")) // ��ư���ڿ��� "Action"���� ��
				b.setText("�׼�"); // ��ư�� ���ڿ��� "�׼�"���� ����
			else
				b.setText("Action"); // ��ư�� ���ڿ��� "Action" ���� ����
			
			// InnerClassListener�� ����� JFrame�� ����� ȣ���� �� ����
			InnerClassListener.this.setTitle(b.getText());
	  }
	}

	public static void main(String[] args) {
		new InnerClassListener();
	

	}
}

