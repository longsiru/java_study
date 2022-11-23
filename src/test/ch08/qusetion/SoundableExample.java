package test.ch08.qusetion;

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		soundable.sound();
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}

interface Soundable {
	public String sound();
}

class Cat implements Soundable {

	@Override
	public String sound() {
		System.out.println("야옹");
		return "야옹";
	}
	
}

class Dog implements Soundable {

	@Override
	public String sound() {
		System.out.println("멍멍");
		return "멍멍";
	}
	
}
