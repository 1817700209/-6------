package day03_demo04;

import day03_demo04.Person;

public class Finery extends Person{
	protected Person component;
	public void decorate(Person component) {
		this.component = component;
	}
	public void show() {
		if (null != component) {
			component.show();
		}
	}
}
