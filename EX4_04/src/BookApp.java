
public class BookApp {

	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮"); // ������ Book(String t, String a) ȣ��
		Book loveStory = new Book("������"); // ������ Book(String t) ȣ��
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);

	}

}
