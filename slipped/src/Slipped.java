import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Slipped extends JFrame{
	JTextField tfid = null;
	JTextField tfid2 = null;
	JTextField tfid3 = null;
	JTextArea taList = null;
	JButton btnSave = null;  
	JLabel sLabel = null;
	JLabel sLabel2 = null;
	JLabel sLabel3 = null;
	

	public Slipped() {
		this.setTitle("�װ� ������ ?");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		JTabbedPane pane = createTabbedPane();
		this.setLayout(null);
		
		c.add(sLabel);
		c.add(sLabel2);
		c.add(sLabel3);
		c.add(tfid);
		c.add(tfid2);
		c.add(tfid3);
		c.add(btnSave);
		c.add(pane, BorderLayout.CENTER);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}

	private JTabbedPane createTabbedPane() {
		JTabbedPane pane =new JTabbedPane();
		pane.addTab("�˻�", new MyPanel());
		pane.setBounds(10,50,50,30);
		pane.addTab("���", new MyPanel2());
		pane.setBounds(10,10,50,30);
		
		return pane;
	}
	
	class MyPanel extends JPanel {
		public MyPanel() {
			sLabel = new JLabel("�ѱ� :");
			sLabel.setBounds(20,45,50,50);
			
		}
	}
	
    class MyPanel2 extends JPanel {
    	public MyPanel2(){
    		
    	sLabel = new JLabel("�ѱ� :");
		sLabel.setBounds(20,45,50,50);
		
		
		sLabel2 = new JLabel("���� :");
		sLabel2.setBounds(20,75,50,50);
		
		
		sLabel3 = new JLabel("���� :");
		sLabel3.setBounds(20,105,50,50);
		
		
		tfid = new JTextField();
		tfid.setBounds(65,60,200,25);
		
		
		tfid2 = new JTextField();
		tfid2.setBounds(65,90,200,25);
		
		
		tfid3 = new JTextField();
		tfid3.setBounds(65,120,200,25);
		

		
		btnSave = new JButton("���");
		btnSave.setBounds(110,160,70,30);
		
		
		btnSave.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		System.out.println("���");
		
		}});
    }
 }
	public static void main(String[] args) {
		new Slipped();

	}
}
