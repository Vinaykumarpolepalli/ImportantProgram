package ImportantPrograms;

import java.util.Scanner;

public class PerfectDo {

	public static void main(String[] args) {
		System.out.println("Main Methos is started !");
		Scanner sc = new Scanner(System.in);
		String option;
	
		do {
			
			System.out.println("Enter a number ");
			int num = sc.nextInt();
			int sum = 0;
			
			for(int i =1;i  <=num/2;i++ ) {
				if(num%i ==0){
					sum= sum+i;
					System.out.println(sum);
				}
			}
			
			if(num==sum) {
				System.out.println("It is a perfect number");
				
			}else {
				System.out.println("not a perfect number");
				
			}
			
			System.out.println("If you want to conitous the program please press the yes or no");
			option= sc.next();
	
		}while(option.equalsIgnoreCase("yes"));
		
		System.out.println("Thanks for using the program man ");
		sc.close();
	}

}
