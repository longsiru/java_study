package test.ch07.question;

public class Parent7 {
	public String nation;
	
	public Parent7() {
		this("대한민국");
		System.out.println("Parent7() call");
	}
	
	public Parent7(String nation) {
		this.nation = nation;
		System.out.println("Parent7(String nation) call");
	}
	
}
