import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx( ) {
		this.setTitle("�̹��� ��ư ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		// 3���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedicon = new ImageIcon("images/pressedicon.gif");
		
		// 3���� �̹����� ���� ��ư ����
		JButton btn = new JButton("call~~", normalIcon); // normalIcon�� �̹��� ���
		btn.setPressedIcon(pressedicon); // pressedicon�� �̹��� ���
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon�� �̹��� ���
		c.add(btn);
		
		this.setSize(250, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
