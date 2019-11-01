package officeHours;

public class Car extends Vehicle {
	 boolean isRunning;
	  
	  public void start() {
	    if(isRunning == false) {
	      isRunning = true;
	      System.out.println("Starting engine!");
	    }else {
	      System.out.println("Engine is already running!");
	    }
	  }
	  
	  public void stop() {
	    if(isRunning == true) {
	      isRunning = false;
	      System.out.println("Stoping engine!");
	    }else {
	      System.out.println("Engine has been already stopped!");
	    }
	  }
}
