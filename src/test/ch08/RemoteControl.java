package test.ch08;
/*
 * 接口（interface）:有时必须从几个类中派生出一个子类，继承它们所有的属性和方法。
 *                 但是，Java不支持多重继承。有了接口，就可以得到多重继承的效果。
 * 接口(interface)是抽象方法和常量值的定义的集合。
 *                 从本质上讲，接口是一种特殊的抽象类，这种抽象类中只包含常量和方法的定义，
 *                 而没有变量和方法的实现。
 *如果一个类中，既有抽象方法，又有非抽象方法，那么该类只能定义为抽象类，不能定义为接口
 *如果一个类中，只有抽象方法，没有非抽象方法，那么该类可以定义为接口,一般就定义为接口
 *定义一个接口，使用interface关键字  接口，类，枚举，注解等都是java中的类型
 *接口中所有的方法，都是抽象方法,所以也可以说，接口就是一个特殊的抽象类
 *接口中除了定义方法外，还可以定义成员变量
 *		特点；方法和属性默认都是public修饰，也可以使用protected，但不能用private
 *			所有的属性都是静态的常量，默认省略了static和final修饰符，属性的值必须实例化（初始化）
 *
 *一、接口中的域
 *	Java编程规范中对interface中的域有几点说明:
 *						一:interface域必须有初始化器，也就是说其必须被显式初始化。
 *						二:不能使用文本定义顺序靠后的字段来给前边字段赋值来初始化。
 *						三:不能使用自身对自身赋值来初始化。
 *						四:接口域的初始化器中不能出现super、this关键字，除非是出现在匿名类的body中。
 *						例如： interface Test {
 *								int a;//第一处未初始化x
 *								float f = j;//第二处使用了文本之后定义的字段x
 *								int j = 1; //o
 *								int k = k + 1;//第三处使用了自身对自身赋值x
 *							}
 *二、接口中的方法
 *	1、接口中的方法其修饰符不需显式指明，都是public。
 *	2、如果需要继承接口的类无需实现接口中的方法，则接口中的该方法可声明成default。
 *	3、接口中声明的不带body的方法隐式的都是abstract方法，无需显式声明。
 *	4、接口不继承static方法。所以接口中static修饰的方法也必须要有方法体。
 *	5、非抽象类继承接口时必须要实现其不含方法体的方法。
 *	6、另外，接口中定义default方法是为其继承类提供方便，子类不用定义，但是却需要使用这一功能。所以加了default修饰的接口方法都必须有方法体。
 *	7、在接口中定义一个成员类型，会隐藏其所有继承的接口中的相同名称的成员。
 */


public interface RemoteControl {
	//interface에 선언된 필드는 모두 public static final 특성을 갖지고 있다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상메소드.
	//public이 없어도 컨파일 과정에서 public abstract가 자동으로 붙는다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디풀트 메소드: interface에서 실행 메소드를 구현하고 싶을때 사용.
	/*
	 * JDK8新增接口中抽象方法的默认实现 使用default关键字
	 * 		加上default关键字后需要实现方法体,子类中成为覆盖该方法	
	 */
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 처리 합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("음소거 해제.");
		}
	}
	
	
	
	//static method
	//code를 구현 할 수 있다.
	//public이 없어도 컴파일 과정에서 public 붙이다.
	/*
	 * 从java 8 开始，接口当中允许定义静态方法体
	 * 格式：public static 返回值类型 方法名称（参数列表）{
	 * 						方法体
	 * 	   }
	 * 提示：就是讲Abstract和default换成static即可，带上方法体。
	 * 注意事项：不能通过接口实现类的对象来调用接口当中的静态对象
	 * 正确用法：通过接口名称，直接调用其中的静态方法
	 * 格式：接口名称：静态方法名（参数）;
	 */
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
	
	
	
	
}
