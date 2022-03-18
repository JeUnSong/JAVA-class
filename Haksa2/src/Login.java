
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame{
	JTextField tfId = null;
	JPasswordField tfPw = null;
	RoundedButton btnLogin = null;
	JButton btnSign = null;
	JLabel hh = null;

	JLabel jllogo = null;
	JLabel jlma = null;
	
	Font font = new Font("���ʷҹ���", Font.BOLD, 12);
	Color bColor =new Color(223,223,223);

DefaultTableModel model=null;
JPanel panel2;
	Login(){
		
		
		  setTitle("�л�����ý��� �α���"); 
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
		  Image img = toolkit.getImage("images/icon2.png");
		  setIconImage(img);
		  
		  setLayout(null);
		  

		  ImageIcon mImg = new ImageIcon("images/hh.png");
		  this.hh = new JLabel(mImg);
		  this.hh.setLocation(190,70);
		  this.hh.setSize(100,100);
		  this.add(hh);
		  
		  this.tfId = new JTextField();
		  this.tfId.setLocation(120,220);
		  this.tfId.setSize(230,50);
		  this.add(tfId);
		  
		  this.tfPw = new JPasswordField();
		  this.tfPw.setLocation(120,280);
		  this.tfPw.setSize(230,50);
		  this.add(tfPw);
		  this.tfPw.setEchoChar('*');

		  
		  this.btnLogin = new RoundedButton("�α���");
		  this.btnLogin.setFont(font);
		  this.btnLogin.setLocation(120,360);
		  this.btnLogin.setSize(230,50);
		  this.btnLogin.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String pw = "";
				
				for(char cha : tfPw.getPassword()) {
					Character.toString(cha);
					pw+=(pw.equals("")) ? ""+cha+"" : ""+cha+"";
				}
				
				
				
				if(tfId.getText().equals("1") && pw.equals("1")) {
						JOptionPane.showMessageDialog(null, "ȯ���մϴ�.", "�α��� �Ϸ�", JOptionPane.INFORMATION_MESSAGE);
						dispose(); // ����â �ݱ�
						panel2.removeAll(); //���������Ʈ ����
						panel2.revalidate(); //�ٽ� Ȱ��ȭ
						panel2.repaint();    //�ٽ� �׸���
						panel2.add(new Haksa()); //ȭ�� ����.
						panel2.setLayout(null);//���̾ƿ��������
						
				}else {
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� Ȯ���� �ּ���.", "�α��� ����", JOptionPane.ERROR_MESSAGE);
				}
			}});
		  this.add(btnLogin);
		 
		  
		  this.jllogo = new JLabel("Welcome to Management!");
		  this.jllogo.setLocation(165,210);
		  this.jllogo.setSize(370,550);
		  this.jllogo.setFont(font);
		  this.add(jllogo);
		  

		  panel2=new JPanel();//panel����
		  this.add(panel2);//�����ӿ� �г� �߰�
		   
		  
		  
		  setSize(495,550);  
		  setVisible(true);
		
	}
	public static void main(String[] args) {
		  new Login();
	 }
}
