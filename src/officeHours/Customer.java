package officeHours;

public class Customer {
	private String name;
	private String email;
	public static int count;
	public static int max_customers = 100;
	
	static {
		//static block always goes first.
		//and it calls only ones.
		System.out.println("Hello from static!");
		//we are redefining value of max_customers, it was 100
		//but, because we changed value in the static block
		//from now one, it's 25.
		max_customers = 25;
	}
	
	public Customer(String name, String email) {
		System.out.println("Calling 2 args constructor...");
		this.name = name;
		this.email = email;
		//it will increased when we will create a new object
		//and only if we create an object with 2 arguments
		count++;
	}
	
	public Customer() {
		System.out.println("Calling no args constructor...");
		this.name = "unknown";
		this.email = "unknown";
		//it will increased when we will create a new object
		//and only if we create an object with no arguments
		count++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
}
