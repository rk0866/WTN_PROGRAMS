package Encapsulation_Inheritence;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}

}
