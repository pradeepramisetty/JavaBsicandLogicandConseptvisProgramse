package java8features;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 what is stream API in java ?
   stream API is used to proccess the collection objects or data
   intermediate and terminal
   intermediate functions are used to perform operations on data and return a new stream
   like filter,map,flatmap,distinct
   filter method is used to proccess and return the new stream it is eccspecting a argument and return true or false 
   map method is used to transform the data
*/
public class StreamApiOnCollections {
	
	public static void main(String[] args) {
		
		Scanner scn  = new Scanner(System.in);
		List<Employee> l1 = new ArrayList<>();
		
		l1.add(new Employee(101,"Pradeep",23,10000.0,"Mahimaluru"));
		l1.add(new Employee(102,"prasad",27,40000.0,"Mahimaluru"));
		l1.add(new Employee(103,"Hbabu",35,80000.0,"Mahimaluru"));
		l1.add(new Employee(104,"dorasanama",35,3000.0,"Mahimaluru"));
		l1.add(new Employee(105,"kavitha",35,2000.0,"Mahimaluru"));
		l1.add(new Employee(106,"madhavi",30,1000.0,"Mahimaluru"));
		l1.add(new Employee(107,"harshitha",18,500.0,"Mahimaluru"));
		
		
		l1.stream().filter(p -> p.geteSal() >= 30000).map(f -> f.geteNmae()).forEach(System.out::println);
		l1.stream().filter(f2 -> f2.geteAge() >= 25).map(f -> f.geteNmae()).forEach(System.out::println);
		
		System.out.println(l1);
		
		Predicate<Integer> p1 = p -> p % 2 == 0;
		System.out.println(p1.test(93));
		
		BiPredicate<Integer,Integer> bp2  = (p2,p3) -> p1 == p1;
		System.out.println(bp2.test(20, 20));
		
		BiPredicate<String,Integer> bp3  = (p2,p3) -> p2.length() == p3 ;
		System.out.println(bp3.test("pradeep", 20));
		
		Function<Integer,Integer> f1 = f -> f * f ;
		System.out.println(f1.apply(34));
		
		
		System.out.println("If you want to print the length and uppercase of your name [please enter your name otherwise enter No]");
		String s1 = scn.nextLine();
		if(s1.equalsIgnoreCase("no")) {
			
		}else {
			Function<String,Integer> f2 = f -> f.length();	
			
			Function<String,String> f3 = f -> f.toUpperCase();
			System.out.println("Given Element Length Is.."+f2.apply(s1)+"..uperscae.."+f3.apply(s1));
		}
		
		
		List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		List<Integer> l3 = l2.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
		
		System.out.println(l3);
		
	}
}
