class Person{
	public String name;
	public void speack() {System.out.println("���ϴ�");}
	public void eat() {System.out.println("�Դ�");}
	public void walk() {System.out.println("�ȴ�");}
	public void sleep() {System.out.println("�ڴ�");}
}
class Student extends Person{
	public void study() {System.out.println("�����ϴ�");}
}
class StudentWorker extends Student{
	public void work() {System.out.println("���ϴ�");}
}
class Researcher extends Person{
	public void research() {System.out.println("�����ϴ�");}
}
class Professor extends Researcher{
	public void teach() {System.out.println("����ġ��");}
}


public class InheritanceTest {

	public static void main(String[] args) {
		Person p=new Person();
		p.name="ȫ�浿";
		System.out.println(p.name);
		
		Student s=new Student();
		s.name="�̼���";
		System.out.println(s.name);
		s.eat();
		s.study();
		
		StudentWorker sw=new StudentWorker();
		sw.name="���";
		System.out.println(sw.name);
		sw.work();
		sw.walk();
		
		Researcher r=new Researcher();
		r.name="������";
		System.out.println(r.name);
		r.research();
		r.sleep();
		
		Professor pf=new Professor();
		pf.name="X";
		pf.teach();

	}

}
