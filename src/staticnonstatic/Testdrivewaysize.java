package staticnonstatic;

public class Testdrivewaysize {

	public static void main(String[] args) {
       Home jenny = new Home();
       jenny.setDrivewaysize(9);
       int jennyDrivewaysize = jenny.getDrivewaysize();
       System.out.println("jenny drivewaysize is :" + jennyDrivewaysize);
       
  //before giving static to class u can assign driveway for diff people and nothing changes
  // after assigning static to class then it changes like the real world scenario
  // when u have a driveway of 1size 2 diff people are sharing the driveway the size obviously changes
      
       Home jessy = new Home();
       jessy.setDrivewaysize(12);
       int jessyDrivewaysize = jessy.getDrivewaysize();
       System.out.println("jessy drivewaysize is :" + jessyDrivewaysize);
       
       // this is eg of nonstatic variable 
       //before giving keyword static to class
       
       int jennyDrivewaysizeafter = jenny.getDrivewaysize();
       System.out.println("jenny drivewaysizeafter is :" + jennyDrivewaysizeafter);
	}

}
