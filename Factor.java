package ImportantPrograms;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
	System.out.println("Main Method ");
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a factor number");
	int num =sc.nextInt();
	
	//String 
	
	

	for (int i = 1; i<=num/2;i++) {
	if(num%i ==0) {
		System.out.println(i);	
	}

	}	
	
    sc.close();
	
	}
}
