package test;

import java.util.Random;

public class Test {

	public Test() {
		System.out.println("Test");
	}
	
	public void test() {
		System.out.println("Methode");
	}
	
	public int zufall() {
		return new Random().nextInt(10);
	}

}
