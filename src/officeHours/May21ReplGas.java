package officeHours;

public class May21ReplGas {
	public class GasTank {
		  //WRITE YOUR CODE HERE
		  //by default 0.0;
		  //instance variables must be private
		  //it will work without private
		  //but, it's bad implementation of OOP (int this case encapsulation). 
		  //encapsulation encourage us to make instance variables private
		  //static variables are mostly public.
		  private double amount;
		  private double capacity;
		  
		  //A constructor that accepts a parameter of type double. 
		  //The value of the parameter is used 
		  //to initialize the value of capacity.
		  public GasTank(double capacity){
		    this.capacity=capacity;
		  }
		  
		  //A method named addGas that accepts a parameter of type double.
		  public void addGas(double gas){
		    if((gas+amount)>capacity){
		      //However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
		      amount = capacity;
		    }else{
		      //The value of the amount instance variable is increased by the value of the parameter.
		      amount+=gas;
		    }
		  }
		  
		  public void useGas(double gas){
		    //the amount instance variable 
		    //is decreased by the value of the parameter. 
		    this.amount-=gas;
		    //However, if the value of amount is decreased below 0, 
		    //amount is set to 0.
		    if(amount<0){
		      amount=0;
		    }
		  }
		  
		  public boolean isEmpty(){
		    //true if the value of amount is less than 0.1, and false otherwise.
		    return this.amount<0.1;
		  }
		  
		  public boolean isFull(){
		    //true if the value of amount is greater than capacity-0.1, 
		    //and false otherwise
		    return amount > (capacity-0.1);
		  }
		  
		  public double getGasLevel(){
		    return this.amount;
		  }
		  
		  // fillUp increases amount to capacity and 
		  //returns the difference between the value of capacity 
		  //and the original value of amount
		  public double fillUp(){
		    // difference between the value of capacity 
		    double difference = capacity - amount;
		    // fillUp increases amount to capacity and 
		    this.amount = this.capacity;
		    return difference;
		  }
		}
}
