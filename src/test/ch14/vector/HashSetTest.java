package test.ch14.vector;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jbdc");
		set.add("jsp");
		set.add("java");
		
		int size = set.size();
		System.out.println(size);  //重复的在一个地址所以结果只算一个，所以这里结果是3而不是4
		
		
	}

}
