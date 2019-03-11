package root;

import java.util.List;

public class StringRecursion {

	public static void main(String[] args) {
		System.out.println(StringOperation.reverseString("hello ksc"));
	}

}

class StringOperation{
	// abcd
	// bcd
	// cd
	// d
	public static String reverseString(String string) {
		if(string.isEmpty()) return "";
		String str = reverseString(string.substring(1)).concat(string.charAt(0)+"");
		return str;
	}
	/*
	public static void revereseOrder(String test) {
		StringBuilder sb = new StringBuilder();
		if(test.isEmpty()) {
			return;
		}
		int index = test.indexOf(" ");
		sb
		.append(revereseOrder(test.substring(index, test.indexOf(" ", index +1))));
		
		
	}
	*/
	
}
