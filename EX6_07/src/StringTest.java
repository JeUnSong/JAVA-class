
public class StringTest {

	public static void main(String[] args) {
		String tel="010-3320-9105";
		
		System.out.println(tel.replace("-", "."));
		System.out.println(tel); // ������ ��ȭ ����
		
		System.out.println(tel.substring(0, 3));
		
		String[] result=tel.split("-");
		for(String s:result) {
			System.out.println(s);
		}
		
		String csv="ȫ�浿,��ǻ�Ͱ��а�,�����";
		String[] result2=csv.split(",");
		for(String s2:result2) {
			System.out.println(s2);
		}
		
		String fileName="report.html";
		int position=fileName.indexOf(".");
		System.out.println(position);
		System.out.println(fileName.substring(position+1));
		
		
		String movieFileName="2022.02.09.movie.mp4";
		System.out.println(movieFileName.substring(movieFileName.indexOf(".")+1));
		System.out.println(movieFileName.substring(movieFileName.lastIndexOf(".")+1));
		
	}
}
