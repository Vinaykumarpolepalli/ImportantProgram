package ImportantPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Main method is Started !");
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a number ");
		int num = sc.nextInt(); 
		long factorials =1;
		for(int i = 1; i<=num;i++) {
			factorials*=i;
		
			}
		
		System.out.println(factorials);
		
		sc.close();
	
	}

}
