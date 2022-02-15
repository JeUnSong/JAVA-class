import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		this.setTitle("üũ�ڽ� ����� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		// �̹��� üũ�ڽ��� ����� 2���� �̹��� ��ü ����
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); //  ���� ���� �̹���
		
		ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg"); // üũ ���� �̹���
		
		// 3���� üũ�ڽ� ����
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��", true);
		JCheckBox cherry = new JCheckBox("ü��", cherryIcon);
		
		cherry.setBorderPainted(true); // üũ�ڽ� �ܰ����� ���̵��� ����
		cherry.setSelectedIcon(selectedCherryIcon); // ���� ���� �̹��� ���
		
		// ����Ʈ�ҿ� 3���� üũ�ڽ� ����
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		this.setSize(250, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
