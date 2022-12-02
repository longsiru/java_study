package test.ch12.wild;

public class GenericsEx {

	public static void main(String[] args) {
		//모든 사람이 신청
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<HihgStudent>(new HihgStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		System.out.println();
		//학생만 신청
		//자기자신과 자식 가져올 수 잇다
//		Course.registerCourse2(new Applicant<Person>(new Person()));
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<HihgStudent>(new HihgStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		System.out.println();
		//직장인 및 일바인
		//자기자신과 부모 클래스를 가져올 수 잇다.
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<HihgStudent>(new HihgStudent()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));
		System.out.println();
	}

}
