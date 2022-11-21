package test.ch08.jiekou;
/*
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.在Java中，接口和类是并列的两个结构
 * 3.如何定义接口，定义接口中的成员
 * 		3.1. jdk7以及以前： 只可以定义全局常量和抽象方法
 * 			 >全局常量：public static final的,但是书写时可以省略
 *           >抽象方法：public abstract的,
 *      
 *      3.2. jdk8： 除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法。
 * 
 * 4. 接口中不可以定义构造器，意味这借口不可以实例化。
 * 
 * 5.Java开发中，接口通过类去实现（implements）的方式来使用。
 * 	 如果实现类覆盖了接口中的所以抽象方法，则此实现类就可以实例化了。
 *   如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类。
 *   
 * 6.java类可以实现多个接口  --> 弥补了Java单继承的局限性。
 *   有继承有实现的格式： class AA extends BB implements CC,DD,EE{}
 *   
 * 7.接口和接口之间可以继承，而且可以多继承。
 * 
 * *********************************************************************
 * 8.接口的具体使用，要体现多态性
 * 9.接口实际上可以看作是一种规范。继承是“是不是的关系”，接口是“能不能的关系”
 * 
 * 面试题：抽象类与接口有哪些异同？
 * 		答：
 */
public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MAX_SPEED);
//		Flyable.MAX_SPEED = 2;
		
		//实现了接口的两个方法后，我们就可以在main中创建Plane对象了
		Plane plane = new Plane();
		plane.fly();
	}
	
}

//接口
interface Flyable{
	//全局常量
	public static final int MAX_SPEED = 7900;  //第一宇宙速度
	int MIN_SPEED = 1; //书写时可以省略 public static final
	
	//抽象方法
	public abstract void fly();
	void stop();//书写时可以省略 public abstract
}



//接口
interface Attackable{
	void attack(); //抽象方法，省略了public abstract
}


//Plane类， 实现两个接口Flyable。
class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("通过引擎起飞");
		
	}

	@Override
	public void stop() {
		System.out.println("驾驶员减速");
		
	}
}

	
//创建一个Kite类，只实现fly()方法，会报错。说明他还是一个抽象类
abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

	
//Bullet类,实现两个接口Flyable,Attackable
class Bullet implements Flyable,Attackable,CC{  //CC中继承得来的方法也可以在这里实现。

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}

//******************************************************************************


interface AA{
	void method1();
}

interface BB{
	void method2();
}

interface CC extends AA,BB{
	//继承了void method1();void method2();
}
	

