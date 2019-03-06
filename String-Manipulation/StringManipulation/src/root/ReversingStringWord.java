package root;

public class ReversingStringWord {

	static String input = "I am Kaushlendra Singh Chauhan";
	
	public static void main(String[] args) {
		//reverseWordUsingStringApi(input);
	}
	
	static void reverseWordUsingStringApi(String input){
		StringBuilder sb = new StringBuilder();
		String[] strings = input.split(" ");
		for(int i = 0;i< strings.length; i++) {
			sb.append(strings[strings.length-1-i]).append(" ");
		}
		System.out.println(sb.toString());
	}
	
	static void reverseWordUsingRecursion(String input){
		StringBuilder sb = new StringBuilder();
		
		
	}
}
