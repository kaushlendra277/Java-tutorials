package root.lambda.expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import lombok.extern.slf4j.Slf4j;
import root.lambda.expression.functional.interfaces.Interf1;
import root.lambda.expression.functional.interfaces.Interf2;

//@SpringBootApplication
/**
 * @author kaush
 *
 */
@Slf4j
public class LambdaExpressionApplication {

	public static final String DASHES = "---------------------------------------------------------";
	public static void main(String[] args) {
		//SpringApplication.run(LambdaExpressionApplication.class, args);
		
		//customFunctionalInterfaces();
		
		// predicateFunctionalInterface();
		
		// predicateFunctionalInterfaceJoining();
		
		// functionFunctionalInterface();
		
		// biFunctionFunctionalInterface();
		
		//comsumerFunctionalInterface();
		
		supplierFunctionalInterface();
		
	}

	public static void customFunctionalInterfaces() {
		
		System.out.println(DASHES);
		log.info("Lambda expression for no args method");
		Interf1 interf1 = () -> log.info("interf1"); // defining lambda expression
		interf1.sam(); // execution of lambda expression
		
		System.out.println(DASHES);
		log.info("Lambda expression for some args and return sum method");
		Interf2 interf2 = (a, b) -> a+b; // defining lambda expression
		log.info(interf2.sumSam(10, 25)+""); // execution of lambda expression
		
		System.out.println(DASHES);
		log.info("Lambda expression for comparator functionaLInterface");
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<String> names = new ArrayList();
		for(int i = 0;i< 5;i++) {
			names.add((int)(Math.random()*100)+"");
		}
		Comparator<String> comparator = (str1, str2) ->str1.compareTo(str2);
		Collections.sort(names, comparator);
		log.info(names.toString());
	}
	
	
	/**
	 * Predicate is a functional interface 
	 * whose sam takes single argument and returns boolean
	 */
	public static void predicateFunctionalInterface() {
		Predicate<String> predicate = str -> str.contains("a");
		System.out.println(predicate.test("KSC")+", "+predicate.test("kaush"));
	}
	
	/**
	 * p1.negate().test(T) = !p1.test("KSC")
	 * p1.and(p2).test(T)  =  p1.test("KSC") && p2.test("KSC")
	 * p1.or(p2).test(T)   =  p1.test("KSC") || p2.test("KSC")
	 */
	public static void predicateFunctionalInterfaceJoining() {
		Predicate<String> p1 = str -> str.contains("a");
		// negate
		System.out.println("pe.negate().test(T)");
		System.out.println(p1.negate().test("KSC")+", "+p1.test("kaush"));
		// and
		System.out.println("p1.and(p2).test(T)");
		Predicate<String> p2 = str -> str.contains("b");
		System.out.println(
				p1.and(p2).test("abc")+", "+
				p1.and(p2).test("KSC"));
		// or
		System.out.println("p1.or(p2).test(T)");
		System.out.println(
				p1.or(p2).test("abc")+", "+
				p1.or(p2).test("a")+", "+
				p1.or(p2).test("b"));
	}
	
	/**
	 * Function is a functional interface 
	 * whose sam takes single argument of type T and returns of Type R
	 */
	public static void functionFunctionalInterface() {
		Function<String, Integer> function = str -> str.length();
		System.out.println(
				function.apply("KSC")+", "+
				function.apply("kaush")
				);
	}
	
	/**
	 * BiFunction is a extention of Function functional interface 
	 * whose sam takes Two argument of type T1, T2 and returns of Type R
	 */
	public static void biFunctionFunctionalInterface() {
		BiFunction<String, String, Integer> biFunction = (str1, str2) -> str1.length()+str2.length();
		System.out.println(
				biFunction.apply("KSC","ABC")+", "+
				biFunction.apply("kaush","ABC")
				);
	}
	
	/**
	 * Consumer is a functional interface 
	 * whose sam takes on argument of type T and returns void
	 */
	public static void comsumerFunctionalInterface() {
		Consumer<String> consumer = str1 -> System.out.println(str1);;
		consumer.accept("KSC"+"ABC");
		consumer.accept("kaushlendra");
	}
	
	/**
	 * Supplier is a functional interface 
	 * whose sam takes no argument and returns of type T
	 */
	public static void supplierFunctionalInterface() {
		Supplier<String> supplier = () -> "Kaushlendra";
		System.out.println(supplier.get());
	}
}
