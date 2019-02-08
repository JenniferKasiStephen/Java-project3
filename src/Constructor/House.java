package Constructor;

public class House {
	public String address;
	public int number;
	
	public House() {}
	public House(String address) {
		this.address = address;
		System.out.println(address);
	}
	public House(int number) {
		this.number = number;
		System.out.println(number);
	}
     public void setAddress(String address) {
    	 this.address = address;
     }
     public void displayAddress() {
    	 System.out.println(this.address);
   
     }
}
