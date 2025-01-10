package ImportantPrograms;

import java.util.Scanner;

public class Perfect1 {
	
	
	
	public static void main(String[] args) {
	System.out.println("Main Methos is Started !");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number ");
	int num = sc.nextInt();
	perfectornot(num);

		
	sc.close();
	}

	public static void perfectornot(int number) {
			
		int sum = 0;
		
		
		for(int i = 1 ; i<=number/2;i++) {
			if(number%i==0) {
				sum= sum+i;
				System.out.println(sum);
				
				
			}
		}
		
		if(number==sum) {
			System.out.println("true ");
			
		}else {
			System.out.println("flase");
		}
		
	}
	

	
	
	}
