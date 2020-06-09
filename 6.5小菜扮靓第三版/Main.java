package day03_demo04;

import day03_demo02.BigTrouser;
import day03_demo04.Person;
import day03_demo04.Sneakers;
import day03_demo04.Suit;
import day03_demo04.TShirts;
import day03_demo04.Tie;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("小菜");
		System.out.println("第一种装扮：");
		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();
		
		pqx.decorate(person);
		kk.decorate(pqx);
		dtx.decorate(kk);
		dtx.show();
		
		System.out.println("第二种装扮：");
		LeatherShoes px = new LeatherShoes();
		Tie ld = new Tie();
		Suit xz = new Suit();
		
		px.decorate(person);
		ld.decorate(px);
		xz.decorate(ld);
		xz.show();
	}
}
