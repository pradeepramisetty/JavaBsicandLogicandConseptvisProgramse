package collectionBasedPrograms;

import java.util.Vector;
import java.util.List;

/*
 what is collection in java?
  collection is a container object,it is used to store multiple unic and duplicates with out size and type limitations is called collection
what is Iterable ?
 iterable is a functional interface means it contains single abstract method that is iterater
 it is the root element of all the collection classes and interface
what is iterator?
 iterate is interface which is used to iterate the elements in forward direction
 its methods ARE hasNext,next and remove 
what is colection? 
 collection is a interface it contains declared methods and which extends multiple interfaces and its implemented classes is called colection
 collection interface have chailed interfaces those are list,set,map,queq and deque
whta is lst interface;
  list interface is a ordered collection  which is used to store the multiple unic and duplecates elements in the index formate is alled list implemented clases are 
  Araay list
  linkd list
  Vector
  stack 
  
what is a vector?
  vector is a legasy collection class available from java 1.0 v
  if we want store multiple unic and duplecate objects with index in insertion orde and thread safety we choose vector
  vector is a Synchronized collection because all its method definatons are declared in syncronized keyword
  
  default capasity of vector is 10 incremental capasity is double 
  vector fallows growable algorithm
  null is allowed multiple nulls are allowed
  
   


*/
public class IntroductionOfCollections {
	
	public static void main(String[] args) {
		
		List<Object> l1 = new Vector<>();
		
	}
	
}
