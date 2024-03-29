package collectionBasedPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

/*
what is vector?
 vector is a legasy collection class, availlable from java 1.0 v
 if we want to store multiple unic and duplecate objects with index base in insertion order with thread-safe we must use vector class
 vector is Synchronized collection
 vector default capacity is 10
 incremental capacity is double
 null is allowed multiple nulls are allowed
 vector fallows growable algorithm
 we can access the objects  randomly and sequesivly 
 
  isEmpty() method returns boolean value if collection contains data return true otherwise returns false
  size() returns the capasity or size of the collection we can also costomize the size
  add(obj) method is used to add the elements in collection
  add(int index,obj) is used to add the elements in collection with specified index
  add(collection obj) is used to add the group of one collection objects into the other group of objects
  add(int index, collection obj) is used to add the grouo elements in specified index
  contains() it returs boolean value ,is used to checks specified element is exist or not
  containsAll(collection obj) it returs boolean value is used to check the given objects are exist or not
  equals(obj) it returns boolean values ,equals method is used compare the object reference or object data
  indexOf(obj) it return index of the give object if object is exist otherwise it returns -1
  lastIndexOf()
  get(index ) get method is used to get the elements of collection
  remove(index ) remove method is used remove the objects in specified index and returns the object
  remove( obj) 
  iterator() iterator is a interface which is used to iterate the elements in forward direction
             hasNext() next() remove()
             hasNext() method returns boolean value if the iterator contains has more elements it returns true otherwise return false
             next() method is used to return the object and moves currser forward direction
             
  ListIterator() it returns the list of elements in the collection ,listIterator is used to iterate the elements in forward direction and backwarddirection       
*/
public class VectorCls {
	
	public static void main(String[] args) {
		 
		List<Object> l1 = new Vector<>();
		List<Object> l2 = new Vector<>();
		System.out.println();
	    System.out.println(l1.size());
	    System.out.println(l1);
	    System.out.println(l1.isEmpty());
	    l1.add("a");
	    l1.add("b");
	    l1.add("c");
	    l1.add(12);
	    System.out.println(l1.size());
	    System.out.println(l1);
	    l1.add(4, 90);
	    System.out.println(l1);
	    l2.add(78);
	    l2.add(50);
	    l2.add(322);
	    l2.add("dff");
	    l2.add("dk");
	    l1.addAll(l2);
	    System.out.println(l1);
	    l1.addAll(2, l2);
	    System.out.println(l1);
	    l1.clear();
	    l1.removeAll(l1);
	    System.out.println(l1.equals(l2));
	    System.out.println(l1);
	    
	    List<Integer> l3 = new Vector<>();
	    l3.add(1);
	    l3.add(2);
	    l3.add(6);
	    l3.add(4);
	    l3.add(5);
	    l3.add(3);
	    
	    List<Integer> l4 = new Vector<>();
	    l4.add(1);
	    l4.add(7);
	    l4.add(6);
	    l4.add(4);
	    l4.add(5);
	    l4.add(3);
//	    l4.
	    System.out.println(l4.indexOf(4));
	    
	  //  l4.
	   // System.out.println(l3.equals(l4));
	    
	    List<Emplyee> l5 = new Vector<>();
	    l5.add(new Emplyee(101,"pradeep",22,4560.0,"mahimaluru"));
	    l5.add(new Emplyee(102,"prasad",27,4560.0,"mahimaluru"));
	    l5.add(new Emplyee(103,"babu",39,456.0,"mahimaluru"));
	    l5.add(new Emplyee(104,"dorasani",34,560.0,"mahimaluru"));
	    
	    List<Emplyee> l6 = new Vector<>();
	    l6.add(new Emplyee(101,"pradeep",22,4560.0,"mahimaluru"));
	    l6.add(new Emplyee(102,"prasad",27,467560.0,"mahimaluru"));
	    l6.add(new Emplyee(103,"babu",39,456.0,"mahimaluru"));
	    l6.add(new Emplyee(104,"dorasani",34,560.0,"mahimaluru"));
	    
	   
	    
	    l6.stream().filter(p -> p.geteName().startsWith("pra")).map(f -> f.geteSal()).forEach(System.out::println);
	    
		
		  System.out.println(l5); System.out.println(l6);
		  System.out.println(l5.equals(l6));
		  
		  Iterator<Emplyee> i1 = l5.iterator();
		  while(i1.hasNext()) {
			  Emplyee e1 = i1.next();
			  System.out.println(e1);
		  }
		  
		  List<Object> l7 = new Vector<>();
		  l7.add(90);
		  l7.add("a");
		  l7.add(34);
		  l7.add(56);
		  l7.add(null);
		  l7.add(6);
		  l7.add("r");
		  l7.add(9.00);
		  l7.add(90.00f);
		  l7.add(90l);
		  l7.add(true);
		  l7.add(null);
		  
		  System.out.println(l7.lastIndexOf(56));
		  
		  for(int i=0; i<l7.size(); i++) {
			  System.out.println(l7.get(i));
		  }
		 
		  System.out.println( ".............."+l7.remove(6));
		  System.out.println( ".............."+l7.remove("r"));
		  for(int i=0; i<l7.size(); i++) {
			  System.out.println(l7.get(i));
		  }
		  
		  ListIterator<Object> lt1 = l7.listIterator();
		  while(lt1.hasNext()) {
			  Object emp = lt1.next();
			  System.out.print(emp);
		  }
		  
		  while(lt1.hasPrevious()) {
			  Object ob = lt1.previous();
			  System.out.println(ob);
		  }
		  
		  List<Integer> l8 = new Vector<>(15);
		  System.out.println("isEmpty.."+l8.isEmpty());
		  System.out.println("capasity.."+l8.size());
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  l8.add(102);
		  System.out.println("isEmpty.."+l8.isEmpty());
		  System.out.println("capasity.."+l8.size());
		  
		  List<Integer> l9 = new Vector<>();
		  l9.add(102);
		  l9.add(102);
		  l9.add(102);
		  l9.add(102);
		  l9.add(102);
		  l9.add(102);
		  
		  Spliterator<Integer> spl1 = l9.spliterator();
		  System.out.println(spl1.estimateSize());
		  System.out.println(spl1.getExactSizeIfKnown());
	//	  System.out.println(spl1.);
		  l9.set(0, null);
		  
		  Vector<Object> v1 = new Vector<>();
		  v1.capacity();
		  v1.trimToSize();
	}
}
