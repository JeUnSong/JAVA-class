import java.util.Scanner;

public class Assignment009 {

	public static void main(String[] args) {
//1. �ֹε�Ϲ�ȣ(010101-123456)���� ��������� �����Ͻÿ�
		String residentRegistrationNumber = "010101-123456";
		StringBuffer rrn = new StringBuffer(residentRegistrationNumber);
		rrn.reverse(); 
		System.out.println(rrn.substring(7));
		
//2. ��ȭ��ȣ(010-1234-5678)���� '-'�� �����Ͻÿ�.
		//=>01012345678 �� �����ϱ�.
		String  phoneNumber ="010-1234-5678";
		 String pn = phoneNumber;
		 String[] result = pn.split("-");
		 for(String s:result)
			 System.out.print(s);
		 System.out.println();
		 
//3. ��ǰ�ڵ�(E20160001)���� ��ǰī�װ�('E')�� �����Ͻÿ�.
		 String productCode = "E20160001";
		 StringBuffer pc =new StringBuffer(productCode);
		 pc.reverse();
		 System.out.println(pc.substring(8));
		 
//4. ��ǰ�ڵ�(E20160001)���� �⵵('2016')�� �����Ͻÿ�.
		 pc.reverse();
		 pc.delete(0,1);
		 pc.delete(4,8);
		 System.out.println(pc);
		 
//5. �ּҷ� csv�����Ϳ��� �����͸� �и��Ͻÿ�.
//ȫ�浿,010-1111-2222,hkd@hkd.com
		 String addressBook="ȫ�浿,010-1111-2222,hkd@hkd.com";
			String[] result1=addressBook.split(",");
			for(String ab:result1) {
				System.out.println(ab);
			}
			
//6. csv�����Ϳ� ������ ���� �й��� ����Ǿ� ���� ��.
//EL201800001,CH201800021,EN12231
//EL-���ڰ��а�
//CH-ȭ�а��а�
//EN-������а�
//�� �й��� �а����� ����Ͻÿ�.
				
				String classNumber = "EL201800001,CH201800021,EN12231";
				String[] result2=classNumber.split(",");
				for(int i=0; i<result2.length; i++) {
					if(result2[i].contains("EL")) {
						System.out.println("���ڰ��а�");
					}else if(result2[i].contains("CH")){
						System.out.println("ȭ�а��а�");
					}else {
						System.out.println("������а�");
					}
					
				}
				
//7. ���̵� !,@,#,$,%,^�� ���Ե� ���
//'���̵� !,@,#,$,%,^�� ���ԵǸ� �ȵ˴ϴ�.'
//�޽��� ����ϱ�. charAt()����.
				
				Scanner scanner = new Scanner(System.in);
				
				
				System.out.println("���̵� �Է��� �ּ��� : ");
				String id = scanner.next();
				
				if(id.contains("!")) {
					System.out.println("���̵� !,@,#,$,%,^�� ���� �ȵ˴ϴ�.");
				}else if (id.contains("@")) {
					System.out.println("���̵� !,@,#,$,%,^�� ���� �ȵ˴ϴ�.");
				}else if (id.contains("#")) {
					System.out.println("���̵� !,@,#,$,%,^�� ���� �ȵ˴ϴ�.");
				}else if (id.contains("$")) {
					System.out.println("���̵� !,@,#,$,%,^�� ���� �ȵ˴ϴ�.");
				}else if (id.contains("%")) {
					System.out.println("���̵� !,@,#,$,%,^�� ���� �ȵ˴ϴ�.");
				}else if (id.contains("^")) {
					System.out.println("���̵� !,@,#,$,%,^�� ���� �ȵ˴ϴ�.");
				}else {
					System.out.println("Ȯ�εǾ����ϴ�.");
				}

			}
	}


