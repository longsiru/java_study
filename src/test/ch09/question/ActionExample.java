package test.ch09.question;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("시작 준비");
			}
			
		};
		action.work();

	}

}



interface Action{
	public void work();
}
