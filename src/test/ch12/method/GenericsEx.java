package test.ch12.method;

public class GenericsEx {
	//generics method
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		//generics callback: T를 Integer로 대체
		Box<Integer> box1 = boxing(100);
		int inValue = box1.get();
		System.out.println(inValue);
		
		Box<String> box2 = boxing("sayo");
		String strValue = box2.get();
		System.out.println(strValue);
		

	}

}
