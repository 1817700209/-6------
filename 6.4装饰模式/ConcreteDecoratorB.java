package day03_demo03;

import day03_demo03.Decorator;

public class ConcreteDecoratorB extends Decorator{
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("����װ�ζ���B�Ĳ���");
	}

	private void addedBehavior() {
		// TODO Auto-generated method stub
		
	}
}
