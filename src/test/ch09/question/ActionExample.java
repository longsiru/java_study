package test.ch09.question;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("μμ μ€λΉ");
			}
			
		};
		action.work();

	}

}



interface Action{
	public void work();
}
