package collection;
//here we cretaed package as collection which that organizes a set of related classes and interfaces.
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {         //created the main class as ArrayListClass
	//public keyword is used in the declaration of a class,method or 
		//field;public classes,method and fields can be accessed by the 
		//members of any class.
		//class defines instance and class fields,methods and inner classes as
		//well as specifying the interfaces the class implements and the 
		//immediate superclass of the class
	  
	public static void main(String[] args) { //created main method 
		//public : it can be called from anywhere.
				//static : doesn't belong to a specific object.
		      	//void : returns to no value.
				//main : is special because it will start the program.
						
		 HDTV tv1 = new HDTV(62, "Sansui"); //created three objects for the HDTV  class 
		  HDTV tv2 = new HDTV(38, "Sony"); //and initializing the values in it 
		  HDTV tv3 = new HDTV(48, "LG");
		  
		  //creating an ArrayList for HDTV class 
		  ArrayList<HDTV> arraylist = new ArrayList<HDTV>(); 
		  arraylist.add(tv1);  //here passing the objects of the hdtv class in the arraylist 
		  arraylist.add(tv2);
		  arraylist.add(tv3);
		 
		  System.out.println("HDTV objects which are sorted in order :");
		  Collections.sort(arraylist, new SizeComparator()); //here it sorts the elements in the arraylist by the size of comparator 
		 // The Java collections framework (JCF) is a set of classes and interfaces that implement commonly reusable collection data structures. 
		  for (HDTV list : arraylist ) {      //here by using for each loop the elements will be sorted by the size and prints the brand names in the 
		   System.out.println(list.getBrand()); //sorted order 
		   //system is final class
		      //out is a static member of system class and type printStream
		      //println is method of printStream class.ln means nextline
		  }
	}}