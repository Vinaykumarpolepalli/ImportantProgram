package ImportantPrograms;

import java.util.Scanner;

public class SumofNumber {



	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number"); 
	  
	 
	  int i = sc.nextInt();
	  int  rem = 0;
	  int sum = 0;
	  
	  while(i != 0) {
		  rem = i %10;
		  i = i/10;
		  sum = sum +rem;
	  }  
		  
     System.out.println("sum of numbers :"+sum);
     sc.close();
	}

}
