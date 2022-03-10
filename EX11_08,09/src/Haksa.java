import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Haksa extends JFrame{
	JTextField tfid = null;
	JTextField tfName = null;
	JTextField tfDepartment = null;
	JTextField tfAddress = null;
	JTextArea taList = null;
	JButton btnSave = null;   // insert - > Create
	JButton btnList = null;   // select - > Read
	JButton btnModify = null; // update - > Update
	JButton btnRemove = null; // delete - > Delete
	                          // DB ��� CRUD
	
	JMenuItem menuItem1 = null;// �л�����
	
	public Haksa() {
		this.setTitle("�л����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		
		
		
		
		
		JMenuBar mb = new JMenuBar();
		JMenu menu1 = new JMenu("�л�����");
		this.menuItem1 = new JMenuItem("�л�����");
		menu1.add(this.menuItem1);
		mb.add(menu1);
		this.setJMenuBar(mb);
		
		this.menuItem1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ȭ�� ��ȯ
				System.out.println("�л����� ȭ�� �ε� ");
				
			}
		});
		

		this.add(new JLabel("�й� "));
		this.tfid = new JTextField(20);
		this.add(tfid);
		this.add(new JLabel("�̸� "));
		this.tfName = new JTextField(20);
		this.add(tfName);
		this.add(new JLabel("�а� "));
		this.tfDepartment = new JTextField(20);
		this.add(tfDepartment);
		this.add(new JLabel("�ּ� "));
		this.tfAddress = new JTextField(20);
		this.add(tfAddress);
		
		this.taList = new JTextArea(17,23);
		this.add(new JScrollPane(taList));
		
		this.btnSave = new JButton("���");
		this.add(this.btnSave);
		this.btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���");
				
			}});
		
		this.btnList = new JButton("���");
		this.add(this.btnList);
		this.btnList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
					System.out.println("����Ϸ�");
					
		Statement stmt = conn.createStatement();

					ResultSet rs = stmt.executeQuery("select * from student");
					
					taList.setText(""); //��� �ʱ�ȭ
					
					taList.append("�й�\t�̸�\t�а�\n");
					taList.append("====================================\n");
					while(rs.next()) {
						//System.out.print(rs.getString("id")+"\t");
						//System.out.print(rs.getString("name")+"\t");
						//System.out.println(rs.getString("dept"));
						taList.append(rs.getString("id") + "\t");
						taList.append(rs.getString("name") + "\t");
						taList.append(rs.getString("dept")+ "\n");
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		
		this.btnModify = new JButton("����");
		this.add(this.btnModify);
		this.btnModify.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����");
				
			}});
		
		this.btnRemove = new JButton("����");
		this.add(this.btnRemove);
		this.btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result =JOptionPane.showConfirmDialog(null, "���� �Ͻðڽ��ϱ�?,","Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_NO_OPTION) {
					//����ó��
					JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}});
		
		
		
		this.setSize(300, 530);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa();

	}

}
