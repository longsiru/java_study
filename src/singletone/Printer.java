package singletone;

public class Printer {
	
	//field
	private static Printer printer = null;
	
	//1.构造方法设置为private，这样在外部就不能生成对象了。
	private Printer() {
		
	}
	
	//method
	public static Printer getPrinter() {
		//printer对象不是null的话，生成printer对象
		if(printer == null) {
			printer = new Printer();
		}
		//이미 printer객체가 생성 되어있으면 나중에는 이미 생성된 printer가 return
		return printer;
	}
	
}
