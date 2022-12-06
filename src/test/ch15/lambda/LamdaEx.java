package test.ch15.lambda;

public class LamdaEx {

	public static void main(String[] args) {
		Person person = new Person();
		person.action((x, y)-> {
			double result = x + y;
			return result;
		});
        //return문이 하나만 있을때는 중괄호 return 생략 가능 
		person.action((x, y) -> x - y);  //和上面的一样
		person.action((x, y) -> x * y);
	}
		
}
