package officeHours;

public class StaticReview {

	public static void main(String[] args) {
		// The best way to call static variables/methods is through the class name
				Customer.count = 1;
				Customer.count = 0;
				Customer cm1 = new Customer("Merzet", "merzet@google.com");
				// Customer [name=Merzet, email=merzet@google.com]
				// this output is possible, because we override toString() method
				// otherwise, we would get weird output
				// toString() CALLS AUTOMATICALLY
				System.out.println(cm1);
				Customer cm2 = new Customer();
				cm2.setEmail("mansur@gmail.com");
				cm2.setName("Mansur");
				System.out.println(cm2);
				System.out.println("Customer class..." + Customer.count); // this is a right way to access static field/variable
				// it will be 1, because we refer to the same variable.
				// because static variable belongs to the class.
				// The static field Customer.count should be accessed in a static way
				System.out.println("Customer 1 object..." + cm1.count); // it's not the best way to access static variable
				System.out.println("Customer 2 object..." + cm2.count); // it's wrong way to access static variable
				Customer cm3 = new Customer();
				System.out.println("Total amount of customers: " + Customer.count);
				System.out.println("Max customers: " + Customer.max_customers);

			}

}
