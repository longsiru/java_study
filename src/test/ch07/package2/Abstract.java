package test.ch07.package2;



public class Abstract {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
    	cat.sound();
		
		//매개변수의 다형성
		animalSound(dog);
		animalSound(cat);

	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}

abstract class Animal{
	public abstract void sound();
}


class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
}


class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("야웅");
		
	}
	
}
