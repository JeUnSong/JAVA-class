package assignment7_1;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Student [] student = new Student[5];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<student.length; i++) {
			System.out.print("�̸� : ");
			String name = scanner.next();
			System.out.print("���� : ");
			int score = scanner.nextInt();
			student[i] = new Student(name, score);
		}
		
		for(int i=0; i<student.length; i++) {
			System.out.print("�̸� : " + student[i].name +" "+ "���� : " + student[i].score + " ");
			System.out.println();
		}
		scanner.close();

	}

}
