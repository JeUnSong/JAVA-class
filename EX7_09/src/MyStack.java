
public class MyStack {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>(); // String Ÿ���� GStack ����
		
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n=0;n<3;n++)
			System.out.println(stringStack.pop()); // stringStack ���ÿ� �ִ� 3���� ���ڿ� ��
		
		GStack<Integer> intStack = new GStack<Integer>(); // Integer Ÿ���� GStack ����
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int n=0;n<3;n++)
			System.out.println(intStack.pop()); // intStack ���ÿ� �ִ� 3���� ���� ��

	}

}
