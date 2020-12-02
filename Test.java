package xxx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		
		System.out.println("開始測試1");
		System.out.println("開始測試2");
		System.out.println("開始測試3");
		
		if (s1 == s2)
			System.out.println("1");
		if (s1.equals(s2))
			System.out.println("2");
	}

}
