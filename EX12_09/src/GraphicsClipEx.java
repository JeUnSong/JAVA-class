import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsClipEx extends JFrame {
private MyPanel panel = new MyPanel();
	
	public GraphicsClipEx() {
		this.setTitle("Ŭ���� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		
		this.setSize(300, 400);
		this.setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("go gator!!", 10, 150);
			
			
		}
	}

	public static void main(String[] args) {
		new GraphicsClipEx();

	}

}