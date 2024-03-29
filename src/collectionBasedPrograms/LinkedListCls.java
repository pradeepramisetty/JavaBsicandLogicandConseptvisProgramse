package collectionBasedPrograms;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
what is linkedList?
  linkedlist is a collections framework collection  class which is implemented list interface,
  if we want to insert or remove object into the begining or middle of the collection we must choose likedlist
  and also retrive the objects ionly in sequential order we need to choose linkedlist

ll is a non-synchronized collection 
ll allows unic and duplicate elements 
ll falows insertion order without index it looks like index but doesn't maintain index
default capacity od ll is 0 incremental capacity is 1
ll fallows doubly linked list algorithm means

  

*/
public class LinkedListCls {
	
	public static void main(String[] abc) {
		
		List<Object> ll1 = new LinkedList<>();
		
		ll1.add("a");
		ll1.add("c");
		ll1.add(45);
		ll1.add("54h");
		ll1.add(true);
		ll1.add(null);
		ll1.add(50);
		ll1.add(90);
		ll1.add('d');
		ll1.add(null);
		ll1.add(true);
		
		System.out.println(ll1.get(5));
		
		for(int i=0; i<ll1.size(); i++) {
			System.out.print(ll1.get(i)+",");
		}
		
		for(Object obj : ll1) {
			System.out.println(obj);
		}
		
		ll1.forEach(System.out::print);
		
		Iterator<Object> itr = ll1.iterator();
		while(itr.hasNext()) {
			Object ob = itr.next();
			System.out.println(ob);
		}
		
		ListIterator<Object> ltr = ll1.listIterator();
		while(ltr.hasNext()) {
			Object ob1 = ltr.next();
			System.out.println(ob1);
		}
		
		ListIterator<Object> ltr2 = ll1.listIterator();
		while(ltr2.hasPrevious()) {
			Object ob2 = ltr2.previous();
			System.out.print(ob2);
		}
	  
		List<Student> ll2 = new LinkedList<>();
		
		ll2.add(new Student(101,"pradeep",23,"ECE"));
		ll2.add(new Student(103,"prasad",27,"ECE"));
		ll2.add(new Student(102,"dorasni",12,"mpc"));
		ll2.add(new Student(104,"harshitha",18,"EEE"));
		ll2.add(new Student(105,"babu",10,"CSE"));
		ll2.add(new Student(107,"ravi",22,"EEE"));
		ll2.add(new Student(106,"navin",30,"Mechanical"));
		
		System.out.println("BEFORE REMOVING............................");
		
		for(Student s1 : ll2) {
			System.out.println(s1);
		}
		
		ll2.removeIf(s -> s.getsAge() > 21);
		
		System.out.println("AFTER REMOVING...............................");
		
		for(Student s1 : ll2) {
			System.out.println(s1);
		}
		
		List<Student> ll3 = new LinkedList<>();
		
		LinkedList<Object> ll4 = new LinkedList<>();
		
		ll4.add(90);
		ll4.add(true);
		ll4.add(null);
		ll4.add(50);
		ll4.add("rt");
		ll4.add('t');
		ll4.add(78);
		ll4.add("io");
		ll4.add(null);
		ll4.add(true);
		ll4.add(90);
		
		for(int i=0; i<ll4.size(); i++) {
			System.out.print(ll4.get(i)+",");
		}
		ll4.addFirst(34);
		ll4.addLast("asdfvb");
		System.out.println();
		
		for(int i=0; i<ll4.size(); i++) {
			System.out.print(ll4.get(i)+",");
		}
		ll4.offer(8000);
		ll4.offerFirst(600);
		ll4.offerLast(700000);
		
		System.out.println();
		for(int i=0; i<ll4.size(); i++) {
			System.out.print(ll4.get(i)+",");
		}
		System.out.println();
		ListIterator<Object> ltr1 = ll4.listIterator(1);
		while(ltr1.hasNext()) {
			Object obj = ltr1.next();
			System.out.print(obj+",");
		}
		
		ll4.push(2000);;
		ll4.push(1000);
		System.out.println();
		System.out.println();
		System.out.println(ll4.peek());
		System.out.println(ll4.peekFirst());
		System.out.println(ll4.peekLast());
		System.out.println();
		System.out.println(ll4.pollFirst());
		System.out.println();
	
		Iterator<Object> itr1 = ll4.iterator();
		while(itr1.hasNext()) {
			Object obj = itr1.next();
			System.out.println(obj);
		}
		
	}
}
