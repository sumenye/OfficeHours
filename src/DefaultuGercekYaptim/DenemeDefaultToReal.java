package DefaultuGercekYaptim;

public class DenemeDefaultToReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float cucumber_price=2.5f;
	int tomato=3;
	float onion=1.5f;
	int pepper=2;
	int carrot=4;
	float total=cucumber_price+4*tomato+pepper+6*carrot+2*onion;
	
	System.out.println("1 Cucumber is " +cucumber_price +" Dollars");
	System.out.println("4 Tomatoes is " + 4*tomato +" Dollars");
	System.out.println("2 Onions is " + 2*onion +" Dollars");
	System.out.println("1 Pepper is " +pepper +" Dollars");
	System.out.println("6 Carrots is " + 6*carrot +" Dollars");
	System.out.println("Our Total Amount is " + total +" Dollars");
	
	double fahrenheit=80d;
	//double celcius=(5/9d)*
	double celcius=(5/9.0d)*(fahrenheit-32);
	System.out.println("The celcius value is "+celcius);
	System.out.println(5/0);
	//if you divide by 0 the compiler will blow up.
	
	

	}

	
}
