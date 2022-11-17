package test.ch06.question;

public class Account {

	private int balance; //
	public static final int MIX_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {

		
		//2. 정상번위가 아니면 현재 balance값 유지
		if (0 > balance || balance > 1000000) return;
		
		//1. 0<= balance < 1000000 번위 일때
		this.balance = balance;
		
		
	}
	
	
	
}
