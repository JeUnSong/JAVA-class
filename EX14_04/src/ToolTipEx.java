import java.awt.*;
import javax.swing.*;

public class ToolTipEx extends JFrame {
	private Container contentPane;
	
	public ToolTipEx() {
		this.setTitle("���� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		this.setSize(400,150);
		this.setVisible(true);
	}
	
	private void createToolBar() {
		
		JToolBar bar = new JToolBar("kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�.");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("������ ���ϴ�.");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("������ �����մϴ�.");
		bar.add(saveBtn);
		bar.add(new JLabel("Search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ���.");
		bar.add(tf);
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("c#");
		combo.addItem("C");
		combo.addItem("C++");
		bar.add(combo);
		
		contentPane.add(bar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolTipEx();

	}

}
