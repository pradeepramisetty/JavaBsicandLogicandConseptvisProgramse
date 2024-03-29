package collectionBasedPrograms;

import java.util.List;
import java.util.Stack;

/*
 Explain what why and how in stack?
   stack is legasy collections framework collection class available from java 1.0v stack extends vector class 
   if we want retrive the elements last in first order(LIFO)in thread saftey we must choose stack
   
   stack is a synchronized collection
   stack allows nulls multiple nulls are allowed
   stack fallows insertion order with index
   
   
*/
public class StackCls {

	public static void main(String[] args) {
		
		Stack<Object> st1 = new Stack<>();
		System.out.println(st1.isEmpty());
		System.out.println(st1.size());
		System.out.println(st1.capacity());
		st1.push("ab");
		st1.push("gh");
		st1.push(48);
		st1.push(45);
		st1.push(1);
		st1.push(23);
		st1.push(4);
		st1.push('5');
		st1.push("pradeep");
		st1.push("klm");
		st1.push("oposite");
		st1.push(7);
		st1.push(9);
		st1.push(true);
		st1.push(null);
		st1.push(true);
		st1.push(null);
		st1.push(90);
		st1.push(4);
		st1.push('5');
		st1.push(48);
		st1.push(90);
		st1.push(90);
		st1.push(90);
		
		System.out.println(st1.isEmpty());
		System.out.println(st1.size());
		System.out.println(st1.capacity());
		st1.trimToSize();
		System.out.println(st1.capacity());
		
		for(int i=0; i<st1.size(); i++) {
			System.out.println(st1.peek());
		}
		
	}
}
