package staticvariable;

public class Home {
	
//example of static variable 
	
	public static int parkingsize;
	
	public void setParkingsize(int parkingsize) {
		this.parkingsize = parkingsize;
	}
	
	public int getParkingsize() {
		return parkingsize;
		
	}
	// example for static method variable
	
	public static void markparkingsize() {
		System.out.println("mark parking size is : " + 20);
		
	}
}
