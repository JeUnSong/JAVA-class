import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLineEx() {
		this.setTitle("drawString ��� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel); // ������ panel �г��� ����Ʈ������ ���
		
		this.setSize(1000, 800);
		this.setVisible(true);
	}
	
	//JPanel�� ��ӹ޴� �� �г� �ۼ�
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
			g.drawLine(20, 20, 100, 100);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
