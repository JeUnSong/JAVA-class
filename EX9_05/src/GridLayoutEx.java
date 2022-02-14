import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		this.setTitle("GridLayout Sample");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 4x2 ������ GridLayout ��ġ������ ����
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5); //���� ������ ���� ������ 5 �ȼ��� ����
		
		Container c = this.getContentPane();
		c.setLayout(grid); // grid�� ����Ʈ���� ��ġ�����ڷ� ����
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		
		this.setSize(300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx();

	}

}
