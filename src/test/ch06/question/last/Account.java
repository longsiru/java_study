package test.ch06.question.last;

public class Account {
	//필드创建变量
	private String ano; //계좌번호  个人情报加private，然后用getter和setter
	private String owner; //계좌주
	private int balance; //잔고
	
	//생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	//메소드创建方法
	//个人情报加private，然后用getter和setter
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
