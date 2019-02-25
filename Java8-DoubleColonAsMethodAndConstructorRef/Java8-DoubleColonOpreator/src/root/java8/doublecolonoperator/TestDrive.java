package root.java8.doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestDrive {

	public static void main(String[] args) {
		// :: for method reference
		Consumer<String> consumer = System.out::println;
		consumer.accept("Hello world using syso as method ref");
		
		//definingPredicateViaMethodRef();
		
		//definingBiFunctionViaMethodRef();
		
		// :: for constructor refernce
		
		Function<String,DoubleColonOPeratorUtils> function = DoubleColonOPeratorUtils:: new ;
		function.apply("hello");
	}
	
	private static void definingPredicateViaMethodRef() {
		// static method reference ClassName :: staticMethodName
		Predicate<String> predicate = DoubleColonOPeratorUtils:: prdicateStaticReference;
		System.out.println(
				predicate.test("ksc")+", "+
				predicate.test("abc")
		);
		
		DoubleColonOPeratorUtils objRef = new DoubleColonOPeratorUtils();
		
		// instance method reference objectReference :: staticMethodName
		Predicate<String> predicate2 = objRef:: prdicateViaObjReference;
		System.out.println(
				predicate2.test("abc")+", "+
				predicate2.test("ksc")
		);
	}
	
	private static void definingBiFunctionViaMethodRef() {
		// static method reference ClassName :: staticMethodName
		BiFunction<Integer, String,Integer> bifunction = DoubleColonOPeratorUtils:: biFunctionStaticReference;
		System.out.println(
				bifunction.apply(5, "ksc")+", "+
				bifunction.apply(16, "abc")
		);
		
		DoubleColonOPeratorUtils objRef = new DoubleColonOPeratorUtils();
		
		// instance method reference objectReference :: staticMethodName
		BiFunction<Integer,String, Integer> biFunction2 = objRef:: biFunctionViaObjReference;
		System.out.println(
				biFunction2.apply(15, "ksc")+", "+
				biFunction2.apply(8, "abc")
		);
	}
}

class DoubleColonOPeratorUtils{
	
	public DoubleColonOPeratorUtils() {
		super();
	}
	
	public DoubleColonOPeratorUtils(String str) {
		super();
		System.out.println("Constructor called via :: operator");
	}

	/**
	 *  it will be used as method reference to define lambda expression
	 *  - method argument type i.e T and return type must match with the Predicate<T> sam
	 */
	public static boolean prdicateStaticReference(String str){
		return str.contains("a");
	}
	
	/**
	 *  it will be used as method reference to define lambda expression
	 *  - method argument type i.e T and return type must match with the Predicate<T> sam
	 */
	public boolean prdicateViaObjReference(String str){
		return str.contains("a");
	}
	
	/**
	 *  it will be used as method reference to define lambda expression
	 *  - method argument type i.e T1, T2 , order of method args and return type must match with the BiFunction<T1,T2,R> sam
	 */
	public static int biFunctionStaticReference(Integer num, String str){
		return str.length()+ num;
	}
	
	/**
	 *  it will be used as method reference to define lambda expression
	 *  - method argument type i.e T1, T2 , order of method args and return type must match with the BiFunction<T1,T2,R> sam
	 */
	public int biFunctionViaObjReference(Integer num, String str){
		return str.length()+ num;
	}
}
