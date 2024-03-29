package collectionBasedPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 what is ArrayList?
  ArrayList is a collections framework collection availlable from java 1.2v it have implemented list and its methods up root interface
  if we want store the multiple unic and duplicate values with index base in insertion order with-out thread safety we must use Array list
  
  ArrayList is a non-synchronized collection and its default capacity is 10 inecremental capasity is half
  null is allowed multiplenuls are allowed 
  it fallows resaizable algorithm
  if we want to insert or remove the elements middle of the collectionit gives less performance because 
  elements are moved right and left of the collection
  it is best to use single thread model applicatons and method local operations
  
*/
public class ArrayListCls {
	
	public static void main(String[] args) {
		
		List<Object> al1 = new ArrayList<>();
		System.out.println(al1.size());
		System.out.println();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		al1.add(30);
		al1.add(90);
		al1.add(90);
		al1.add(true);
		al1.add(null);
		al1.add(90.90);
		al1.add(58.9f);
		al1.add(null);
		
		List<Object> al2 = new ArrayList<>(al1);
		
		System.out.println(al2.equals(al1));
		
		for(int i=0; i<al2.size(); i++) {
			System.out.print(al2.get(i)+",");
		}
		
	    for(Object obj : al2) {
	    	System.out.println(obj);
	    }
	   
	    List<Emplyee> al3 = new ArrayList<>();
	    al3.add(new Emplyee(101,"pradeep",23,200.03,"mahimaluru"));
	    al3.add(new Emplyee(103,"pradsad",27,20000.03,"chenai"));
	    al3.add(new Emplyee(102,"hazarat babu",34,39000.03,"kovuru"));
	    al3.add(new Emplyee(105,"kavitha",34,598000.03,"navuru"));
	    al3.add(new Emplyee(104,"Dorasanama",34,100.03,"as peta"));
	    al3.add(new Emplyee(107,"harshitha",18,500.03,"mahimaluru"));
	    al3.add(new Emplyee(106,"ravindra",20,1000.03,"ankapali"));
	    al3.add(new Emplyee(108,"aravindh",15,2000.03,"atmakuru"));
	    al3.add(new Emplyee(109,"masthanaiah",29,5000.03,"kavali"));
	    
	    
	    System.out.println("before sorting the elements");
	    
	    for(int i=0; i<al3.size(); i++) {
	    	System.out.println(al3.get(i)+",");
	    }
	    
	   Collections.sort(al3, new Comparator<Emplyee>() {

		@Override
		public int compare(Emplyee o1, Emplyee o2) {
			
			return o1.geteName().compareTo(o2.geteName());
		}
		   
	   });
	   System.out.println("after sorted.........................");
	   for(int i=0; i<al3.size(); i++) {
		   System.out.println(al3.get(i));
	   }
	   System.out.println("after sorted.....no.............................");
	   Collections.sort(al3);
	   for(Emplyee emp : al3) {
		   System.out.println(emp);
	   }
	   
	   List<Student> al6 = new ArrayList<>();
	   
	   al6.add(new Student(101,"pradeep",23,"ECE"));
	   al6.add(new Student(103,"prasad",27,"ECE"));
	   al6.add(new Student(102,"dorasni",12,"mpc"));
	   al6.add(new Student(104,"harshitha",18,"EEE"));
	   al6.add(new Student(105,"babu",10,"CSE"));
	   al6.add(new Student(107,"ravi",22,"EEE"));
	   al6.add(new Student(106,"navin",30,"Mechanical"));
	   
	   Collections.sort(al6, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getsBranch().compareTo(o2.getsBranch());
		}
		   
	   });
	   System.out.println("sorted elements are....................................");
	   for(Student s : al6) {
		   System.out.println(s);
	   }
	   
	   Object[] a1 = al1.toArray();
	   for(int i=0; i<a1.length; i++) {
		   System.out.println(a1[i]);
	   }
	   List<Integer> al7 = new ArrayList<>();
	   
	   al7.add(90);
	   al7.add(40);
	   al7.add(10);
	   al7.add(60);
	   al7.add(70);
	   al7.add(80);
	   al7.add(50);
	   al7.add(00);
	   al7.add(800);
	   
	   Integer[] i1 = (Integer[]) al7.toArray();
	   
	//   Exception in thread "main" java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.Integer; ([Ljava.lang.Object; and [Ljava.lang.Integer; are in module java.base of loader 'bootstrap')
	//	at JavaBasicLogicalPrograms/collectionBasedPrograms.ArrayListCls.main(ArrayListCls.java:129)

	   for(Integer i2 : i1) {
		   System.out.println(i2);
	   }
	   
	ArrayList<Object> al8 = new ArrayList<>();
	al8.trimToSize();
	 
	}
	
}
