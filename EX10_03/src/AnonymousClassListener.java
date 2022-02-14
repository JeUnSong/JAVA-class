import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener () {
		this.setTitle("Action �̺�Ʈ ������ �ۼ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource(); 
				if(b.getText().equals("Action")) {
					b.setText("�׼�"); 
				}else {
					b.setText("Action"); 
				}
				// AnonymousClassListener�� ����� JFrame�� ����� ȣ���� ������
			}
		});
		
		this.setSize(350,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
