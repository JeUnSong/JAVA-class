import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GraphicsColorFontEx extends JFrame {
private MyPanel panel = new MyPanel();
	
	public GraphicsColorFontEx() {
		this.setTitle("Color, Fon ��� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		
		this.setSize(350, 470);
		this.setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("I Love Java.~~", 30, 30);
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much", 30, 60);
			g.setColor(new Color(0x00ff00ff));
			for(int i=0; i<=5; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 60+i*60);
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsColorFontEx();

	}

}
