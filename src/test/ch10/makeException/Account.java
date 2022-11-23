package test.ch10.makeException;

public class Account {
	//field
	private long balance; //잔고
	
	
	//생성자
	public Account() {}
	
	
	//메소드
	public long getBalance() {
		return balance;
	}
	
	//저축
	public void depost(int money) {
		balance += money;//잔고에 동을 누적 합산한다
	}
	
	//출긐
	public void withdraw(int money) throws InsuffException {
		//잔고보다 네가 츨금하려는 돈이 더 크면 에외 발생시텸.
		if (balance < money) {
			throw new InsuffException("잔고 부촉: " + (money - balance) + "원이 모자탐");
		}
		
		balance -= money;
	}
}
