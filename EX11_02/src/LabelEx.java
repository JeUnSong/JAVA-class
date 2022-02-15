import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
	public LabelEx() {
		this.setTitle("���̺� ����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		//���ڿ� ���̺� ����
		JLabel textLabel = new JLabel("�����");
		
		// �̹��� ���̺� ����
		ImageIcon beauty = new ImageIcon("images/beauty.jpg"); // �̹��� �ε�
		JLabel imageLabel = new JLabel(beauty); // �̹��� ���̺� ����
		
		//���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); // �̹��� �ε�
		JLabel label = new JLabel("��������� ��ȭ��", normalIcon, SwingConstants.CENTER); // ���̺� ����
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		this.setSize(400,600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();

	}

}
