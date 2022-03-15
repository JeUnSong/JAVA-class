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
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame{
	JTextField tfId = null;
	JTextField tfPw = null;
	JButton btnLogin = null;
	JButton btnSign = null;

DefaultTableModel model=null;
JPanel panel2;
	Login(){
		
		  setTitle("�л�����ý��� �α���"); 
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
		  Image img = toolkit.getImage("images/icon2.png");
		  setIconImage(img);
		  
		  setLayout(null);

		  this.tfId = new JTextField("���̵�");
		  this.tfId.setLocation(240,390);
		  this.tfId.setSize(150,25);
		  this.add(tfId);
		  
		  this.tfPw = new JTextField("��й�ȣ");
		  this.tfPw.setLocation(240,420);
		  this.tfPw.setSize(150,25);
		  this.add(tfPw);
		  //this.tfPw.setEchoChar('*');
		  
		  this.btnLogin = new JButton("�α���");
		  this.btnLogin.setLocation(405,392);
		  this.btnLogin.setSize(75,50);
		  this.btnLogin.addActionListener(new ActionListener() {

			//DB�� �ִ� ���̵� ��й�ȣ ������ ������ IF ���ǹ��� �־����
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tfId.getText().equals("�׽�Ʈ") && tfPw.getText().equals("�׽�Ʈ")) {
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
		  
		  this.btnSign = new JButton("���� ȸ���� �ƴϽŰ��� ?");
		  this.btnSign.setLocation(240,460);
		  this.btnSign.setSize(200,30);
		  this.btnSign.setBackground(new Color(238, 238, 238));
		  this.btnSign.setFont(new Font("����ü", Font.PLAIN, 13));
		  this.btnSign.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				panel2.removeAll(); //���������Ʈ ����
				panel2.revalidate(); //�ٽ� Ȱ��ȭ
				panel2.repaint();    //�ٽ� �׸���
				panel2.add(new SignUp()); //ȭ�� ����.
				panel2.setLayout(null);//���̾ƿ��������
				
			}});
		  this.add(btnSign);
		  
		  panel2=new JPanel();//panel����
		  this.add(panel2);//�����ӿ� �г� �߰�
		  
		  
		  setSize(700,600);  
		  setVisible(true);
		
	}
	public static void main(String[] args) {
		  
		  new Login();
	 }
}
