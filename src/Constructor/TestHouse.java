package Constructor;

public class TestHouse {

	public static void main(String[] args) {
       House house1 = new House();
       house1.setAddress("3-7 camp hill");
       house1.displayAddress();
       
       House house2 = new House("27 ave");
       House house3 = new House("8-9 ave");
    
       }

}
