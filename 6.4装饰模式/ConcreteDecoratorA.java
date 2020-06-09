package day03_demo03;

import day03_demo03.Decorator;

public class ConcreteDecoratorA extends Decorator{
	private String addedState;
	public void operation() {
		super.operation();
		addedState = "new state";
		System.out.println("具体装饰对象A的操作");
	}
}
