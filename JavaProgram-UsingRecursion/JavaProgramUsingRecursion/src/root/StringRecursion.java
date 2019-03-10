package root;

public class StringRecursion {

	public static void main(String[] args) {
		System.out.println(StringOperation.reverse("hello"));
	}

}

class StringOperation{
	// abcd
	// bcd
	// cd
	// d
	public static String reverse(String string) {
		if(string.isEmpty()) return "";
		String str = reverse(string.substring(1)).concat(string.charAt(0)+"");
		return str;
	} 
}
