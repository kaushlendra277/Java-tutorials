package root;

public class ReversingString {
	
	public static void main(String[] args) {
		String str = "happy";
		//reverseUsingLoop(str);
		//reverseUsingStrinBuilderApi(str);
		System.out.println(reverseUsingRecursion(str));
	}

	private static void reverseUsingLoop(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i< str.length();i++) {
			sb.append(str.charAt(str.length()-1-i));
		}
		System.out.println(sb.toString());
	}
	
	private static void reverseUsingStrinBuilderApi(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}
	//abcd
	//bcd
	//cd
	//d
	//empty
	private static String reverseUsingRecursion(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.isEmpty()) return "";
		return sb
				.append(reverseUsingRecursion(str.substring(1)))
				.append(str.charAt(0)).toString();
	}
	
}
