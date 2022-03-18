//�����ʿ� �� ���� Ȯ��

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student extends JPanel{
	JTextField tfId = null;
	JTextField tfName = null;
	JTextField tfDepartment = null;
	JTextField tfAddress = null;
	JTextArea taList = null;
	
	JLabel jlId = null;
	JLabel jlName = null;
	JLabel jlDepartment = null;
	JLabel jlAddress = null;
	JLabel mmm = null;
	
	RoundedButton btnSave = null;   // insert - > Create
	RoundedButton btnList = null;   // select - > Read
	RoundedButton btnModify = null; // update - > Update
	RoundedButton btnRemove = null; // delete - > Delete
	                          // DB ��� CRUD
	RoundedButton btnSearch=null;
	
	DefaultTableModel model=null; // ���̺� ���� ������
	JTable table=null;            // ���̺�
	
	JMenuItem menuItem1 = null; // �л�����
	
	
	Font font = new Font("���ʷҹ���", Font.BOLD, 10);
	public Student() {
		this.setLayout(new FlowLayout());
		
		
		this.jlId = new JLabel("  ��   ��");
		this.jlId.setFont(font);
		this.add(jlId);
		
		this.tfId = new JTextField(15);
		this.add(tfId);
		
		this.btnSearch = new RoundedButton("�� ��");
		this.btnSearch.setFont(font);
		this.add(this.btnSearch);
		this.btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
					System.out.println("����Ϸ�");
					
					Statement stmt = conn.createStatement();

					ResultSet rs = stmt.executeQuery("select * from student where id='"+tfId.getText()+"'");
					
					model.setRowCount(0); // ��� �ʱ�ȭ
					while(rs.next()) {
						String[] row=new String[4];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);
						
						tfId.setText(rs.getString("id"));
						tfName.setText(rs.getString("name"));
						tfDepartment.setText(rs.getString("dept"));
						tfAddress.setText(rs.getString("address"));
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});

		this.jlName = new JLabel("��   ��");
		this.jlName.setFont(font);
		this.add(jlName);
		this.tfName = new JTextField(20);
		this.add(tfName);
		
		this.jlDepartment = new JLabel("��   ��");
		this.jlDepartment.setFont(font);
		this.add(jlDepartment);
		this.tfDepartment = new JTextField(20);
		this.add(tfDepartment);
		
		this.jlAddress = new JLabel("��    ��");
		this.jlAddress.setFont(font);
		this.add(jlAddress);
		this.tfAddress = new JTextField(20);
		this.add(tfAddress);
		
		 String colName[]={"�й�","�̸�","�а�","�ּ�"};
		 this.model=new DefaultTableModel(colName,0);
		 this.table = new JTable(this.model);
		 this.table.setPreferredScrollableViewportSize(new Dimension(250,280));// ���̺� ũ�� 330px x 200px
		 this.table.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				    table=(JTable)e.getComponent();//Ŭ���� ���̺� ���ϱ�
				    model=(DefaultTableModel)table.getModel();//���̺��� �� ���ϱ�
				    
				    String no=(String)model.getValueAt(table.getSelectedRow(), 0); // �й�
			        tfId.setText(no);
			        
	        	    String name=(String)model.getValueAt(table.getSelectedRow(), 1); // �̸�
				    tfName.setText(name);
				    
				    String dept_id=(String)model.getValueAt(table.getSelectedRow(), 2); // �а�
				    tfDepartment.setText(dept_id);
				    
				    String address=(String)model.getValueAt(table.getSelectedRow(), 3); // �ּ�
				    tfAddress.setText(address);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			});
		 
		 JScrollPane sp=new JScrollPane(this.table);
		 this.add(sp);
		 
		this.btnSave = new RoundedButton("�� ��");
		this.btnSave.setFont(font);
		this.add(this.btnSave);
		this.btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
					System.out.println("����Ϸ�");
					
					Statement stmt = conn.createStatement();
		
					stmt.executeUpdate("insert into student values('"+tfId.getText()+"','"+tfName.getText()+"','"+tfDepartment.getText()+"','"+tfAddress.getText()+"')");

					ResultSet rs = stmt.executeQuery("select * from student");
					
					model.setRowCount(0); // ��� �ʱ�ȭ
					while(rs.next()) {
						String[] row=new String[4];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		// ��ư �̹��� �����ʿ�
		this.btnList = new RoundedButton("�� ��");
		this.btnList.setFont(font);
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
					
					model.setRowCount(0); // ��� �ʱ�ȭ
					while(rs.next()) {
						String[] row=new String[4];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);
					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		// ��ư �̹��� �����ʿ�
		this.btnModify = new RoundedButton("�� ��");
		this.btnModify.setFont(font);
		this.add(this.btnModify);
		this.btnModify.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
					System.out.println("����Ϸ�");
					
					Statement stmt = conn.createStatement();
					
					stmt.executeUpdate("update student set name='"+tfName.getText()+"',dept='"+tfDepartment.getText()+"',address='"+tfAddress.getText()+"'where id='"+tfId.getText()+"'");

					ResultSet rs = stmt.executeQuery("select * from student");
					
					model.setRowCount(0); // ��� �ʱ�ȭ
					while(rs.next()) {
						String[] row=new String[4];
						row[0]=rs.getString("id");
						row[1]=rs.getString("name");
						row[2]=rs.getString("dept");
						row[3]=rs.getString("address");
						model.addRow(row);


					}
					rs.close();
					stmt.close();
					conn.close();
					
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}});
		// ��ư �̹��� �����ʿ�
		this.btnRemove = new RoundedButton("�� ��");
		this.btnRemove.setFont(font);
		this.add(this.btnRemove);
		this.btnRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int result =JOptionPane.showConfirmDialog(null, "���� �Ͻðڽ��ϱ�?,","Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_NO_OPTION) {
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");
						System.out.println("����Ϸ�");
						
						Statement stmt = conn.createStatement();
						
						stmt.executeUpdate("delete from student where id='"+tfId.getText()+"'");

						ResultSet rs = stmt.executeQuery("select * from student");
						
						model.setRowCount(0); // ��� �ʱ�ȭ
						while(rs.next()) {
							String[] row=new String[4];
							row[0]=rs.getString("id");
							row[1]=rs.getString("name");
							row[2]=rs.getString("dept");
							row[3]=rs.getString("address");
							model.addRow(row);
						}
						rs.close();
						stmt.close();
						conn.close();
						
					}catch(Exception e1) {
						e1.printStackTrace();
					}
					
					JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}});	
		this.setSize(280, 530);
		this.setVisible(true);
	}

}
