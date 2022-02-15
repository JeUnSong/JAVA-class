import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	private String [] fruits = {"apple", "banana", "kiwi", "mango"}; // �޺��ڽ��� ������
	
	private ImageIcon [] images = { // �̹��� ��ü �迭
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg")};
	private JLabel imgLabel = new JLabel(images[0]); // �̹��� ���̺� ������Ʈ
	private JComboBox<String> strCombo = new JComboBox<String>(fruits); // ���ڿ� �޺� �ڽ�
	
	public ComboActionEx() {
		this.setTitle("�޺��ڽ� Ȱ�� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		// Action ������ ���
		strCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				// Action �̺�Ʈ�� �߻��� �޺��ڽ� �˾Ƴ���
				int index = cb.getSelectedIndex();
				// �޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
				imgLabel.setIcon(images[index]);
				// �ε����� �̹����� �̹��� ���̺� ������Ʈ�� ���
				
			}});
		
		this.setSize(300,250);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
		

	}

}
