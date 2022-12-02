package test.ch14.vector;


import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		  //Vector 컬렉션 생성
//          List<Board> list2 = new Vector<>();//list是 vector的父母接口（自动变形）

//		Vector<Board> list = new Vector<>();
		ArrayList<Board> list = new ArrayList<>();
		
		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목", "내용", "글쓰기"));
				}
			}
			
		};
		
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목", "내용", "글쓰기"));
				}
			}
			
		};
		
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료 될 때까지 메인 스레느를 기다리게 하는 코드
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {}
		
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
	}

}
