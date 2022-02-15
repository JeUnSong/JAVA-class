import javax.swing.*;
import java.awt.*;

public class RedioButtonEx extends JFrame {
	public RedioButtonEx() {
		this.setTitle("������ư ����� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		// �̹��� ������ư�� ����� ���� 2���� �̹��� ��ü ����
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); //  ���� ���� �̹���
		
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg"); // ���� ���� �̹���
		
		// ��ư �׷� ��ü ����
		ButtonGroup g = new ButtonGroup();
		
		// ������ư 3�� ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��", cherryIcon);
		
		cherry.setBorderPainted(true); // üũ�ڽ� �ܰ����� ���̵��� ����
		cherry.setSelectedIcon(selectedCherryIcon); // ���� ���� �̹��� ���
		
		// ��ư �׷쿡 3���� ���� ��ư ����
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		// ����Ʈ�ҿ� 3���� ������ư ����
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		this.setSize(250, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new RedioButtonEx();

	}

}