package test.ch04.qusetion;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	 
	public int getTotal() {
		return kor + eng + math; 
		
	}
	
	public float getAverage() {
		return (kor + eng + math)/3 * 100 /100;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "name" + name + ", ban" + ban + ", no" + no;
	}
	
	
	
	
}
