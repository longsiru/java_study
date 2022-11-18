package test.ch06.question.last;

import java.util.Scanner;



public class BankApplication {
	private static Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
	
	//게좌객체를 담을 배열
	private static Account[] accountArray = new Account[100]; 

	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
//			BankApplication b = new BankApplication(); //static없으면 객체 생성해야해.
			System.out.println("------------------------------------------");
			System.out.println("1.계좌번호 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) creatAccount();
			else if (selectNo == 2) accountList();
			else if (selectNo == 3) despoit();
			else if (selectNo == 4) withdraw();
			else if (selectNo == 5) run = false;
		}
		System.out.println("프로그램 종료");
		
	}

		
		

	//static이 있어야 main 메소드에서 바로 호출 가능
	//1.게좌생성
	public static void creatAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		
		System.out.print("계좌주:");
		String owner = scanner.next();
		
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance); //계좌만듬
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;  //계좌를 넣고 for반복문를 끝낸다.
			}
//			System.out.println(accountArray[i]);
		}
	}
	
	//2.계좌목록
	public static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			
		}
	}
	
	//3. 예금
	public static void despoit() {
		//계좌번호, 예금액 입력받아(scanner)
		//계좌번호로 계좌를 찾아야 한다.
		//Account account = findAccount(ano) //호출
		//찾는 계좌에 예금을 해준다.
	    //account.setBalance(account.getBalance() + 예금예);
	}
	
	//4. 출금
	public static void withdraw() {
		//계좌번호, 예금액 입력받아(scanner)
		//계좌번호로 계좌를 찻자야 한다.
		//찾는 계좌에 출금을 해준다.
	}
	
	//5. accountArray 배열에서 ano와 동일한 Account객체 찾는 역할을 한다.
	private static Account findAccount(String ano) {
		Account account = null;
		
		for(int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]!= null) {  //null이니면 계좌가 있다느 말
				//불러온 계좌안에 있는 계좌 번호와 매개변수로 받아온 계좌번호 무ㅐ가 같은지 확인
				String dbAno = accountArray[i].getAno();
				
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;  //在for文的括号后return。
	}
}
