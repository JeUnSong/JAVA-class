import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame"); // ������ Ÿ��Ʋ �ޱ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ������ ������ ���α׷��� �����ϵ��� ����
		
		Container contentPane = getContentPane(); // ����Ʈ ���� �˾Ƴ���.
		contentPane.setBackground(Color.orange); // ����Ʈ ���� ���� ������ ������
		contentPane.setLayout(new FlowLayout()); // ����Ʈ �ҿ� FlowLayout ��ġ������ �ޱ�
		
		contentPane.add(new JButton("OK")); // ��ư �ޱ�
		contentPane.add(new JButton("Cancel")); // ��ư�ޱ�
		contentPane.add(new JButton("Ignore")); // ��ư �ޱ�
		
		this.setSize(300,150); // ������ ũ�� 300x150 ����
		this.setVisible(true); // ȭ�鿡 ������ ���
		
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}