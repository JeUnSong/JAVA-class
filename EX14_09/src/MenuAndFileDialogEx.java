import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.awt.*;

public class MenuAndFileDialogEx extends JFrame{
	private JLabel imageLabel = new JLabel();
	
	public MenuAndFileDialogEx() {
		this.setTitle("Menu�� JFileChooser Ȱ�뿹��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.add(imageLabel);
		createMenu();
		this.setSize(350,200);
		this.setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		openItem.addActionListener(new OpenActionListenr());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	
	class OpenActionListenr implements ActionListener {
		private JFileChooser chooser;
		
		public OpenActionListenr() {
		chooser = new JFileChooser();
    }
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF & PNG Images","jpg,","gif", "png");
			
			chooser.setFileFilter(filter);
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				
				JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�","���", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			pack();
		}
	}
	

	public static void main(String[] args) {
		new MenuAndFileDialogEx();

	}
}
