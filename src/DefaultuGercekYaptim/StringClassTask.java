package DefaultuGercekYaptim;
import java.util.Scanner;

public class StringClassTask {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);	
System.out.println("Enter two names please:");
String s1 = scan.next();
String s2 = scan.next();

if (s1.length()>s2.length())
	System.out.println(s1.charAt(1));
else 
	System.out.println(s2.charAt(2));



char lastCharacter = s1.charAt(s1.length()-1);
// int lastCharacter = s1.length();
System.out.println("The last caharacter of first name : "+ lastCharacter);
char firstCharacter = s1.charAt(0);
System.out.println("The first caharacter of first name : "+ firstCharacter);

//OPTIONAL
boolean result = (s1.length()>s2.length()) ? true : false;
System.out.println("Is first name longer than the second one? :" +result);

switch(lastCharacter) {
case 'a':
	System.out.println("name as ended with a");
	break;
case 'b':
	System.out.println("name as ended with b");
	break;
case 'c':
	System.out.println("name as ended with c");
	break;
	default:
		System.out.println("NO MATCH AT ALL");	
}

	}

}
