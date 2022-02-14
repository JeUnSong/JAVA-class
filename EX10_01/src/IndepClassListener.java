import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener () {
		this.setTitle("Action �̺�Ʈ ������ ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action �̺�Ʈ ������ �ޱ�
		                                               // btn�� ���Ǵ� ������ ����
		c.add(btn);
		
		this.setSize(350,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}

}

// ������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ��Ѵ�.
class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); // �̺�Ʈ �ҽ� ��ư �˾Ƴ���
		if(b.getText().equals("Action")) // ��ư���ڿ��� "Action"���� ��
			b.setText("�׼�"); // ��ư�� ���ڿ��� "�׼�"���� ����
		else
			b.setText("Action"); // ��ư�� ���ڿ��� "Action" ���� ����
		
	}
	
}