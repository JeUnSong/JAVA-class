import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		this.setTitle("Null Container Sample");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(null); // ����Ʈ���� ��ġ������ ����
		
		//JLabel ������Ʈ �����ϰ� ��ġ�� ũ�⸦ ���� �����Ѵ�.
		JLabel la =new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		// 9���� ��ư ������Ʈ�� �����ϰ� ��� ������ ũ��� �����Ѵ�.
		//��ġ�� ���� �ٸ��� ����
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // ��ư ����
			b.setLocation(i*15, i*15); // ��ư�� ��ġ ����
			b.setSize(50, 20);
			c.add(b);
		}
		this.setSize(300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();

	}

}
