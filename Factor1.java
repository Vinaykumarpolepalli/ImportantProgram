package ImportantPrograms;

import java.util.Scanner;

public class Factor1 {
	
	
	public static void factor(int a ) {
		for (int i = 1;i<=a/2;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method id started ! ");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number");
	    int a = sc.nextInt();
	    
	    
	    factor(a);
	    sc.close();
	}
	
}
