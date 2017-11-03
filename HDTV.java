package collection;
//here we cretaed package as collection which that organizes a set of related classes and interfaces.
import java.util.Comparator;

public class HDTV {


private String brandName;  
//taking two variables of brandName as string type and size as int type
//private for String and int reference blocks the direct access from outer objects
private int size;

public HDTV (int size,String brandName){ 
	//created the constructors and passing the arguments in it
	this.brandName =brandName;
	this.size = size;
}

public void HDTV(int size2, String brandName2) {
	// TODO Auto-generated constructor stub
}

public String getBrand() {          
	//creating the get method for brand name with default parameters 
	return brandName;                
	//it return the brand name
}
public void setBrand(String bandname) {           
	//creating the set method and passing the string type arguments        
	this.brandName = bandname;
}
public int getSize() {     
	//now creating the get and set methods for size 
	return size;
}
public void setSize(int size) { 
	//here it is passing the integer type of arguments
	this.size = size;
}

public String toString(){    
	//it passes the String as toString() method and returns the value for it
	return size+brandName;
	
}

}
class SizeComparator implements Comparator<HDTV> { 
	//created a class SizeComparator which implements comparator of the HDTV class
 @Override
 public int compare(HDTV tv1, HDTV tv2) { 
	 //created a method compare and implemented parameters of object1and object2 
  int tv1Size = tv1.getSize();  
  //declared the get size of tv1 and tv2
  int tv2Size = tv2.getSize();
  //if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.
  if (tv1Size > tv2Size) {
	  //created if loop which checks the condition is true or false
  return 1;
  //returns the value 1
   
  } else {
   return 0;

 }
}

}