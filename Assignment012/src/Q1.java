import javax.swing.*;
import java.awt.*;
//1.����9-5 ȭ���� FlowLayout�� ����Ͽ� �ۼ��Ͻÿ�.
public class Q1 extends JFrame {
	public Q1() {
		this.setTitle("Assignment012_1");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		Container in= this.getContentPane();
		
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField("",10));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField("",10));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField("",10));
		c.add(new JLabel(" ����"));
		c.add(new JTextField("",10));
		
		this.setSize(180,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Q1();

	}

}