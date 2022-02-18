import javax.swing.*;
import java.awt.*;

public class TabbedPaneEx extends JFrame {
	public TabbedPaneEx() {
		this.setTitle("���� ����� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		this.setSize(250,250);
		this.setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("tab1", new JLabel(new ImageIcon("images/img1.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/img2.jpg")));
		pane.addTab("tab3", new MyPanel());
		return pane;
				
	}
	
	class MyPanel extends JPanel {
		public MyPanel() {
			this.setBackground(Color.YELLOW);
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab 3�� ���� JPanel �Դϴ�", 30, 30);
		}
	}

	public static void main(String[] args) {
		new TabbedPaneEx();

	}

}
