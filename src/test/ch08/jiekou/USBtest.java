package test.ch08.jiekou;
/*
 * 接口的使用
 * 1. 接口的使用上也满足多态性
 * 2. 接口实际上就是定义了一种规范
 */
public class USBtest {
	public static void main(String[] args) {
		//电脑传输数据，所以需要创建一个电脑对象
		Computer com = new Computer();
		Flash flash = new Flash();
//		computer.transferData(usb);  //x 本身接口不可造对象
		com.transferData(flash);//本身接口不可造对象，所以只能造实现类的对象,所以不是用usb而使用flash
		
		Printer printer = new Printer();
		com.transferData(printer);
		
	}

}

//电脑类
class Computer{
	//USB usb = new Flash(),虽然声明的是usb,但实际上是一个实现类的对象，要通过多态的方式去用，因为自己没有构造方法，造不了对象
	public void transferData(USB usb) {//要传输数据，就要遵循USB的传输规范，传输数据传输了一个usb这个对象
		//怎么传输，首先开启
		usb.start();
		System.out.println("具体传输数据的细节");
		
		//传输完之后，结束
		usb.stop();
	}
}

//定义一个接口
interface USB{
	//常量定义了长，宽，最大最小的传输速度等
	void start();
	
	void stop();
}

//定义一个u盘类，实现USB接口
class Flash implements USB{

	//在这里重写一下方法
	@Override
	public void start() {
		System.out.println("u盘开启工作");
	}

	@Override
	public void stop() {
		System.out.println("u盘停止工作");
	}
	
}

//定义一个打印机，来实现USB接口
class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开启工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机开启工作");
	}
	
}
