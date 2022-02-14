import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel(); // ���̺� ������Ʈ ����
	
	public KeyCodeEx() {
		this.setTitle("Key Code ���� : F1Ű:�ʷϻ�, % Ű �����");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		this.setSize(300,150);
		this.setVisible(true);
		
		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		c.setFocusable(true);
		c.requestFocus();
	}
	
	// key ������ ����
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			//la�� �Էµ� Ű�� Ű �̸� ���ڿ��� ����Ͽ� ����ڿ��� ������
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"Ű�� �Է� �Ǿ���");
			
			if(e.getKeyChar() == '%') // �Էµ� Ű�� % �� ���
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1) // �Էµ�Ű�� <F1>�� ���
				contentPane.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();

	}

}
