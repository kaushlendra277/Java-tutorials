package root;

import java.util.ArrayList;
import java.util.List;

public class CountingNumberOfConsecutiveOccurence {
	static String input = "aabbcccddaabcdd";
	//expected output = a2b2c3d2a2b1c1d2
	public static void main(String[] args) {
		usingCollectionApi(input);
	}
	
	private static void usingCollectionApi(String input) {
		int length = input.length();
		List<Character> chars = new ArrayList<Character>();
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < length-1;i++) {
			if(input.charAt(i) == input.charAt(i+1)) {
				chars.add(input.charAt(i));
			}else {
				if(!chars.isEmpty())
					sb.append(chars.get(0).toString()).append(chars.size()+1);
				else
					sb.append(input.charAt(i)+"").append(1);
				chars.clear();
			}
		}
		if(!chars.isEmpty())
			sb.append(chars.get(0).toString()).append(chars.size()+1);
		else
			sb.append(input.charAt(length-1)+"").append(1);
		System.out.println(sb.toString());
	}
}
