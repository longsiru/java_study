package singletone;

public class Main {

	public static void main(String[] args) {
		User[] user = new User[10]; //user객체 담을 배열을 정리.
		
		for(int i=0; i<user.length; i++) {
			//user객체를 생성해서 배열에 넣어준다.
			user[i] = new User("user" + i);//user0,1,2,3,4,5,6,7,8,9
			
			//생성한객체에서 print()
			user[i].print();
		
		
		}
	}

}
