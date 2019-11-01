package DefaultuGercekYaptim;

import java.util.Scanner;

public class ScannerPractice2 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in); 
    // short cut for importing is COMMAND/CONTROL + SHIFT + O 
    // ask user questions 
//    System.out.println("Enter your name today : ");
//    // save user input into String
//    String name = input.next();  // This will only pick up a word as Sring
//    
////    System.out.println("Enter your age today : ");
////    // save user input into int
////    int age = input.nextInt(); 
//
//  // TASK 2 
//    // ASK USER TO ENTER BIRTH YEAR AS A NUMBER 
//    // and calculate users age 
//    System.out.println("Enter your birth year : ");
//    int birthYear = input.nextInt(); 
//    int age = 2019 - birthYear ; 
    
    // Be careful , bear shouldnt ingest large fluffy dog 
    // boolean char , byte , short, int , long , float, double 
    
    //// YOU CAN NOT SAVE USER INPUT AS CHAR 
    // BECAUSE THERE IS NO WAY TO DIFFERENCIATE STRING AND CHAR IN USER INPUT
    
    System.out.println("Enter float value : " );
    //byte b1 = input.nextByte();
    //short b1 = input.nextShort();
    float b1 = input.nextFloat();
    //double d1 = input.nextDouble(); 
    System.out.println( "You have entered float value " + b1 );
    
    System.out.println("Are you hungry ? " );
    boolean isHungry = input.nextBoolean();
    System.out.println(" I am hungry " + isHungry);
    
    // come back at 9:15
    
    /*
    System.out.println("Your name is : " + name );
    System.out.println("Your age is : " + age );
    System.out.println("Your age is : " + (2019 - birthYear)   );
    
    System.out.println("Your name is : " + name 
            + "\n Your Age is " + age);
     */

  }

}
