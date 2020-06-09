package day03_demo02;

import day03_demo02.Person;
import day03_demo02.Sneakers;
import day03_demo02.Suit;
import day03_demo02.TShirts;

public class Main {
	public static void main(String []args) {
		Person person = new Person("第一种装扮：");
		Finery dtx = new TShirts();
		Finery kk = new BigTrouser();
		Finery pqx = new Sneakers();
		
		dtx.show();
		kk.show();
		pqx.show();
		person.show();
		System.out.println("第二种装扮：");
		Finery xz = new Suit();
		Finery ld = new Tie();
		Finery px = new LeatherShoes();
		
		xz.show();
		ld.show();
		px.show();
		person.show();
	}
}
