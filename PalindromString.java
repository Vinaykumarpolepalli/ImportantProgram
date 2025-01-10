package ImportantPrograms;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args ) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter a number  ");
	 int num = sc.nextInt();
	 int temp = num;
	 int rem= 0;
	 int reverse=0;
	 
	 
	while(num!=0) {
		rem = num %10;
		num = num/10;
		reverse = reverse * 10+rem;
	}
		
		if (temp == reverse) {
			System.out.println("It is palindrom");
			
		}else {
			System.out.println("not a palindrom");
		}
		sc.close();
	}
	

		      
		    }
		
