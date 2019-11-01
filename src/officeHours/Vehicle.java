package officeHours;
//A vehicle (from Latin: vehiculum[1]) is a machine that transports people or cargo. 
//Vehicles include wagons, bicycles, motor vehicles (motorcycles, cars, trucks, buses), 
//railed vehicles (trains, trams), watercraft (ships, boats), 
//amphibious vehicles (screw-propelled vehicle, hovercraft), 
//aircraft (airplanes, helicopters) and spacecraft.

public class Vehicle {
	  int speed;
	  int numOfWheel;
	  String type;
	  String brand;
	  
	  public void accelerate(int speed) {
	    System.out.println("Vehicle is accelerating!");
	    this.speed+=speed;
	  }
	  
	  public void slowDown(int speed) {
	    System.out.println("Vehicle is slowing down..");
	    this.speed-=speed;
	  }
}
