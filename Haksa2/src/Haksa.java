import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Haksa extends JFrame{
	JTextField tfid = null;
	JTextField tfpw = null;
	JButton btnLogin = null;
	
 JPanel panel;  // �޴��� ȭ���� ��µǴ� �г�
 Haksa(){
  setTitle("�л�����ý���"); 
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x��ư ������ ���α׷� ����
  
  JMenuBar bar=new JMenuBar();
  
  JMenu m_student=new JMenu("�л�����");//File�޴�
  bar.add(m_student);
  JMenu m_book=new JMenu("��������");//Edit�޴�
  bar.add(m_book);
  
  JMenuItem mi_list=new JMenuItem("�л�����");
  m_student.add(mi_list);
  
  mi_list.addActionListener(new ActionListener(){

   @Override
   public void actionPerformed(ActionEvent e) {
    panel.removeAll(); //���������Ʈ ����
    panel.revalidate(); //�ٽ� Ȱ��ȭ
    panel.repaint();    //�ٽ� �׸���
    panel.add(new Student()); //ȭ�� ����.
    panel.setLayout(null);//���̾ƿ��������
    
   }});
   
  JMenuItem mi_bookRent=new JMenuItem("������");
  m_book.add(mi_bookRent);
  
  mi_bookRent.addActionListener(new ActionListener(){

   @Override
   public void actionPerformed(ActionEvent e) {
    panel.removeAll(); //���������Ʈ ����
    panel.revalidate(); //�ٽ� Ȱ��ȭ
    panel.repaint();    //�ٽ� �׸���
    panel.add(new BookRent()); //ȭ�� ����.
    panel.setLayout(null);//���̾ƿ��������
    
   }});
  
  panel=new JPanel();//panel����
  add(panel);//�����ӿ� �г� �߰�
  
  Container c= getContentPane();
  c.setLayout(null);
  
  tfid = new JTextField("���̵�");
  tfid.setLocation(280,350);
  tfid.setSize(150,25);
  c.add(tfid);
  
  tfpw = new JTextField("��й�ȣ");
  tfpw.setLocation(280,380);
  tfpw.setSize(150,25);
  c.add(tfpw);
  
  btnLogin = new JButton("�α���");
  btnLogin.setLocation(445,352);
  btnLogin.setSize(75,50);
  c.add(btnLogin);
  
  //���̵� ��й�ȣ �α��� ������ �ƹ��͵� ����ȵ�
  
  setJMenuBar(bar);
  setSize(800,600);  
  setVisible(true);
 }
 public static void main(String[] args) {
  
  new Haksa();
 }

}