import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

public class ClickAndDoubleClickEx extends JFrame {
	public ClickAndDoubleClickEx() {
		this.setTitle("Click and DoubleClick ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane(); 
		c.addMouseListener(new MyMouseListener());// Mouse ������ �ޱ�
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	//MouseAdapter�� ��ӹ޾� Mouse ������ ����
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) { // ����Ŭ���� ���
				//[0,255] ������ ������ r,g,b ���� �� ���
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				Component c = (Component)e.getSource(); // ���콺�� Ŭ���� ������Ʈ
				c.setBackground(new Color(r,g,b)); // ����� r,g,b ������ ĥ�Ѵ�.
			}
		}
	}

	public static void main(String[] args) {
		new ClickAndDoubleClickEx();

	}

}
