import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX2 extends JFrame implements ActionListener {
	public EX2 () {
		this.setTitle("Action �̺�Ʈ ������ �ۼ�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(this);
		c.add(btn);
		
			
		
		this.setSize(350,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); 
		if(b.getText().equals("Action")) {
			b.setText("�׼�"); 
		}else {
			b.setText("Action"); 
		}
		
	}

}
