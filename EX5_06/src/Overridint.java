
public class Overridint {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� " + weapon.fire());

	}

}
