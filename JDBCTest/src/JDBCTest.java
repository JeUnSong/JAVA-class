import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			//oracle jdbc����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
			//Connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora_user","hong");// ����
			System.out.println("����Ϸ�");
			
			Statement stmt = conn.createStatement();
			
			//stmt.executeUpdate("insert into student values('1111111','ȫ�浿','ö�а�')"); //������ ���� ���� ���� ���ϵ�
			                      //����
			//stmt.executeUpdate("update student set dept='���ڰ���' where id='1234567'"); 
			                      //����
			stmt.executeUpdate("delete from student where id='1234567'");
			                      //����
			
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getString("dept"));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {}

	}

}
