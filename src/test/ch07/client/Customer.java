package test.ch07.client;
/*
 *这个class里面是把silver一般顾客，作为父类class
 *对silver一般顾客拥有的情报进行setting 
 *1. 进行变量声明：看设计图的话我们已知需要对“顾客ID，顾客名字，顾客等级，积分，积分比率”进行声明。
 *
 *
 *
 *
 *2. 构造方法： 构造方法是用来创建对象，并且同时给对象的属性赋值。构造方法的语法：
 *                                                      [修饰符列表] 构造方法名(形式参数列表){
 *                                                      	构造方法体；
 *                                                      }
 *    注意： 1.修饰符列表：public。
 *    	   2.构造方法名和类名必须一致
 *    	   3.构造方法不需要指定返回值类型，也不能写void，写了void就是method了。
 *   
 *    
 *    
 *    
 *    
 *3. 方法定义语法：
 *   方法定义： public static 方法返回值 方法名称([参数类型 形参...]){
 *											 方法体代码；
 *											 return 返回值
 *											}
 *	 方法调用：返回值变量 = 方法名称(实参。。。)	;
 *   注意1.方法定义时，参数可以没有，每个参数要指定类型
 *      2.返回值也可以没有，如果没有返回值类型应该写成void。
 *      3.方法定义必须写在类之中	
 *   
 *      
 *      
 *      
 *      
 *4.因为	“顾客ID，顾客名字，顾客等级”是受保护的变量，但是其他类需要使用时就要借助get和set。
 *   在父类中写入“顾客ID，顾客名字，顾客等级”	的get和set。					
 */
public class Customer {
	//field
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	//constructor
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	
	//method
	//고객등급 초급화
	private void initCustomer() { 
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	
	//고객 보너스 계산
	public int calcPrice(int price) {
		bonusPoint += (int) (price * bonusRatio);  //포인트 = 포인트+ (가격 * 보너스비율)
		return price;
	}
	
	
	//고객정보
	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade + ", 보너스 포인트: " + bonusPoint + "점" ;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
