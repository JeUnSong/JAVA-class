import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame{
	JTextField tfid = null;
	JTextField tfpw = null;
	JButton btnLogin = null;
	JButton btnSign = null;

JPanel panel2;
	Login(){
		
		  setTitle("�л�����ý��� �α���"); 
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
		  Image img = toolkit.getImage("images/icon2.png");
		  setIconImage(img);
		  
		  setLayout(null);
		  
		  this.tfid = new JTextField("���̵�");
		  this.tfid.setLocation(240,390);
		  this.tfid.setSize(150,25);
		  this.add(tfid);
		  
		  this.tfpw = new JTextField("��й�ȣ");
		  this.tfpw.setLocation(240,420);
		  this.tfpw.setSize(150,25);
		  this.add(tfpw);
		  
		  this.btnLogin = new JButton("�α���");
		  this.btnLogin.setLocation(405,392);
		  this.btnLogin.setSize(75,50);
		  this.btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // ����â �ݱ�
				panel2.removeAll(); //���������Ʈ ����
				panel2.revalidate(); //�ٽ� Ȱ��ȭ
				panel2.repaint();    //�ٽ� �׸���
				panel2.add(new Haksa()); //ȭ�� ����.
				panel2.setLayout(null);//���̾ƿ��������
				
				
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
