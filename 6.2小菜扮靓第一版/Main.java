package day03_demo01;

import day03_demo01.Person;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("С��");
		System.out.println("��һ��װ�磺");
		person.wearTShirts();
		person.wearBigTrouser();
		person.wearSneakers();
		person.show();
		System.out.println("�ڶ���װ�磺");
		person.wearSuit();
		person.wearTie();
		person.wearLeatherShoes();
		person.show();
	}
}
