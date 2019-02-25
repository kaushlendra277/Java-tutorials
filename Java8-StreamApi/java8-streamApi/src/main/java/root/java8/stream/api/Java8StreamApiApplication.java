package root.java8.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@SpringBootApplication
public class Java8StreamApiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Java8StreamApiApplication.class, args);
		List<String> strings = Arrays.asList("bb","dddd", "ccc","a","ffffff","eeeee");
		StreamUtils utils = new StreamUtils(strings);
		utils.filter(strings);
		utils.filterAndCount(strings);
		utils.map(strings);
		utils.forEachOnStream(strings);
		utils.forEachOnList(strings);
	}

}

class StreamUtils{
	private List<String> strings ;
	private final static String DASHES = "-----------------------------------------------";

	public StreamUtils(List<String> strings) {
		super();
		this.strings = strings;
	}
	
	public void filter(List<String> strings) {
		System.out.println(DASHES+", filter");
		List<String> filteredStrings = strings
										.stream()
										.filter(string -> string.length() > 3)
										.collect(Collectors.toList())
										;
		System.out.println(filteredStrings);
	}
	
	public void filterAndCount(List<String> strings) {
		System.out.println(DASHES+", filterAndCount");
		long filteredStrings = strings
									.stream()
									.filter(string -> string.length() > 3)
									.count()
									;
		System.out.println(filteredStrings);
	}
	
	public void map(List<String> strings) {
		System.out.println(DASHES+", map");
		List<String> filteredStrings = strings
									.stream()
									.map(string ->{
										if(string.length() > 3) {
											return string.substring(0, 2);
										}else {
											return string;
										}
									})
									.collect(Collectors.toList())
									;
		System.out.println(filteredStrings);
	}
	
	public void forEachOnStream(List<String> strings) {
		System.out.println(DASHES+", forEachOnStream");
		strings
			.stream()
			.sorted()
			.forEachOrdered(System.out::println);
	}
	
	public void forEachOnList(List<String> strings) {
		System.out.println(DASHES+", forEachOnList");
		strings.forEach(System.out::println);
	}
	
	
	
}
