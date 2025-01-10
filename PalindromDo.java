package ImportantPrograms;

import java.util.Scanner;

public class PalindromDo {

	public static void main(String[] args) {
		System.out.println("main method started ! ");
		Scanner sc = new Scanner (System.in);
		String chioce; 
		
		do{
			System.out.println("Enter a number");
			int num= sc.nextInt();
			int temp =num;
			int rem=0;
			int reverse=0;
			
			while(num!=0) {
				
					rem =num%10;
					num = num/10;
					reverse =reverse*10+rem;
			}
					if(temp==reverse) {
					System.out.println("It is palindrom");
					}else {
						System.out.println("not a palindrom");
					}
					System.out.println("If you want to repeat the program ? yes or no");
					chioce=sc.next();
					
				}while(chioce.equalsIgnoreCase("yes"));
			
		
		
sc.close();
	}

}
