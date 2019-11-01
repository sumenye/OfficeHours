package OCAMentoring;

import java.util.Scanner;

public class TaskFourDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String printed = "";
		
		System.out.println("Enter a 4 digit number:");
		int num = scan.nextInt();
		if(num>1000) {
			int n1 = num/1000;
			int n2 = num%1000-num%100;
			int n3 = num/10-num%10;
			int n4 = num%10;
			String firstdigit = (n1==0)?"":(n1==1)?"one":(n1==2)?"two":(n1==3)?"three":(n1==4)?"four":(n1==5)?"five"
					:(n1==6)?"six":(n1==7)?"seven":(n1==8)?"eight":(n1==9)?"nine":"Invalid";
			String secondigit = (n2==0)?"":(n2==1)?"one":(n2==2)?"two":(n2==3)?"three":(n2==4)?"four":(n2==5)?"five"
					:(n2==6)?"six":(n2==7)?"seven":(n2==8)?"eight":(n2==9)?"nine":"Invalid";
			String thirdigit = (n3==0)?"ten":(n3==1)?"eleven":(n3==2)?"twelve":(n3==3)?"thirteen":(n3==4)?"fourteen"
						:(n3==5)?"fiften" :(n3==6)?"sixteen":(n3==7)?"seventeen":(n3==8)
							?"eighten":(n3==9)?"nineteen":"Invalid";
			String fourthdigit = (n4==0)?"":(n4==1)?"one":(n4==2)?"two":(n4==3)?"three":(n4==4)?"four":(n4==5)?"five"
					:(n4==6)?"six":(n4==7)?"seven":(n4==8)?"eight":(n4==9)?"nine":"Invalid";
			//printed = firstdigit+"thousand"+secondigit+"hundred"+thirdigit+""
			
			
		}

	}

}
