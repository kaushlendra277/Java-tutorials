package root;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapJava8Api {

	private static final String INPUT = "aaaaabbaabb";
	// expected output = a7b4
	public static void main(String[] args) {
		//asPerPreJava8(INPUT); // least preferred
		
		//asPerJava8Compute1(INPUT); // more preferred
		
		//asPerJava8Compute2(INPUT);// asPerJava8Compute1 preferred over this
		
		asPerJava8Merge(INPUT); // most preferred, since here we have flexibility given by increment  
	}
	
	/**
	 * @param string
	 * 
	 */
	private static void asPerJava8Merge(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < string.length(); i++ ) {
			char charAt = string.charAt(i);
			BiFunction<Integer, Integer, Integer> remappingFunction = (v,one) ->{
				return v == null ? one : v+one;
			};
			int increment = 1;
			map.merge(charAt, increment , remappingFunction);
		}
		
		StringBuilder sb = new StringBuilder();
		map.forEach((k,v) -> {
			sb
			.append(k)
			.append(v);
		});
		
		System.out.println(sb.toString());
		
	}
	
	/**
	 * @param string
	 * 
	 */
	private static void asPerJava8Compute2(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < string.length(); i++ ) {
			char charAt = string.charAt(i);
			BiFunction<Character, Integer, Integer> remappingFunction = (k,v) ->{
				return  v+1;
			};
			map.computeIfPresent(charAt, remappingFunction);
			map.computeIfAbsent(charAt, (v) -> 1);
		}
		
		StringBuilder sb = new StringBuilder();
		map.forEach((k,v) -> {
			sb
			.append(k)
			.append(v);
		});
		
		System.out.println(sb.toString());
		
	}

	
	/**
	 * @param string
	 * 
	 */
	private static void asPerJava8Compute1(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < string.length(); i++ ) {
			char charAt = string.charAt(i);
			BiFunction<Character, Integer, Integer> remappingFunction = (k,v) ->{
				return v == null ? 1: v+1;
			};
			map.compute(charAt, remappingFunction);
		}
		
		StringBuilder sb = new StringBuilder();
		map.forEach((k,v) -> {
			sb
			.append(k)
			.append(v);
		});
		
		System.out.println(sb.toString());
		
	}

	private static void asPerPreJava8(String string) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < string.length(); i++ ) {
			char charAt = string.charAt(i);
			if(map.putIfAbsent(charAt, 1) != null) {
				map.put(charAt, map.get(charAt)+1);
			}
				
		}
		
		StringBuilder sb = new StringBuilder();
		map.forEach((k,v) -> {
			sb
			.append(k)
			.append(v);
		});
		
		System.out.println(sb.toString());
	}
}
