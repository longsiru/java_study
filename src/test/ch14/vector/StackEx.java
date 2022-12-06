package test.ch14.vector;
/*
 * Stack:先入后出
 */
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//동전 렇기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동존 꺼내기
		while(!coinBox.isEmpty()) {  //비어있지 않다면 반복
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue());
			
		}
	}

}



class Coin{
	private int value;
	public Coin (int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
	
	
	
}