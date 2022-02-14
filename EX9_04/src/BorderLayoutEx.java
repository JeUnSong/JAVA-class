import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() { 
		this.setTitle("BorderLayout Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		
		//����Ʈ�ҿ� BorderLayout ��ġ������ ����
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		this.setSize(1100, 800); // ������ ũ�� 300x200 ����
		this.setVisible(true); // �������� ȭ�鿡 ���
	}

	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
