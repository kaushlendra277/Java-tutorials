package root.lambda.expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import root.lambda.expression.functional.interfaces.Interf1;
import root.lambda.expression.functional.interfaces.Interf2;

//@SpringBootApplication
@Slf4j
public class LambdaExpressionApplication {

	public static final String DASHES = "---------------------------------------------------------";
	public static void main(String[] args) {
		//SpringApplication.run(LambdaExpressionApplication.class, args);
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

}
