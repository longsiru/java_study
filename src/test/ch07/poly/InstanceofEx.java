package test.ch07.poly;

public class InstanceofEx {
	
	public static void personInfo(Person person) {  //用static的话，不生成对象也可以直接使用
		System.out.println("name: " + person.name);
		person.walk();
		
		if(person instanceof Student) { //person이 Student 객채를 갖고 있냐?
			Student student = (Student)person;  //강제타입 변환
			student.study();
			System.out.println(student.studentNo);
			
		}
	}

	public static void main(String[] args) {
		//Person person = new Person("홍길동");  是一样的
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		//Person person = new Student("longlong", 10);  是一样的
		Person p2 = new Student("longlong", 10);
		personInfo(p2);
	}

}
