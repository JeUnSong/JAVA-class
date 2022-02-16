import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		this.setTitle("drawString ��� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel); // ������ panel �г��� ����Ʈ������ ���
		
		this.setSize(250, 200);
		this.setVisible(true);
	}
	
	//JPanel�� ��ӹ޴� �� �г� �ۼ�
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("�ڹٴ� ������~~", 30, 30); // �г� (30, 30) ��ġ�� ���ڿ� ���
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ ~ " , 60, 60); // �г� (60,60) ��ġ�� ���ڿ� ���
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}

}
