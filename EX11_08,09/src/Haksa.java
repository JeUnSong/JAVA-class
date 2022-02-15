import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	public Haksa() {
		this.setTitle("�л����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
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
				System.out.println("���");
				
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
				System.out.println("����");
				
			}});
		
		
		
		this.setSize(300, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Haksa();

	}

}
