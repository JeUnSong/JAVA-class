
public class Person {
	private int weight;     // private ���� ����. Student Ŭ�������� ���� �Ұ�
	int age;                // ����Ʈ ���� ����. Student Ŭ�������� ���� ����
	protected int height;   // protected ���� ����. Student Ŭ�������� ���� ����
	public String name;     // public ���� ����. Student Ŭ�������� ���� ����
	
	public void setWeight(int weight) {
		this.weight = weight;
	}                                 // private ����� weight�� �����ϱ� ���� get/set �޼ҵ�
	public int getWeight() {
		return weight;
	}

}
