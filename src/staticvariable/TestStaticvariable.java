package staticvariable;

public class TestStaticvariable {

	public static void main(String[] args) {
       Home jacob = new Home();
       jacob.setParkingsize(20);
       int jacobparkingsize = jacob.getParkingsize();
       System.out.println("jacob parking size is : " + jacobparkingsize);
	
       
      Home james = new Home();
      james.setParkingsize(18);
      int jamesparkingsize = james.getParkingsize();
      System.out.println("james parking size is : " + jamesparkingsize);
      
      int jacobparkingsizeAfter = jacob.getParkingsize();
      System.out.println("jacobparkingsizeAfter is :" + jacobparkingsizeAfter);
      
 // static method keyword
 //if class and method are static then u can call the method with class name directly without creating new object
 //use of static variable u can save memory as u need not create a new object to call another method
 //if class is not static then u have to create new object to call the static method
      
       Home.markparkingsize();
    		  
    	   
	}

}
