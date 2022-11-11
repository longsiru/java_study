package test.ch05;

public class ReferenceEX {

	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3};
		int[] newIntArray = new int[5];
		
		//copy Array --> Array's size
//		for (int i = 0; i < oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
		System.arraycopy(oldIntArray, 0, newIntArray, 0,oldIntArray.length);
		//System.arraycopy()
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
		
		
		
		/*
		String[] strArray= new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		*/
		
		/*
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);  //比较的是地址，值一样也是不相等的。
		System.out.println(arr2 == arr3);  //上面声明了，arr3= arr3代表两个在一个地址，所以相等。
		
		int[] intArray = null;
		intArray[0] = 10;  //无法存在intArray 因为他是null。
		*/
		
		
	}

}
