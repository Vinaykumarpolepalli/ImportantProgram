package ImportantPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
    System.out.println("Main method is started!");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int a = sc.nextInt();
    int b = a;
    int sum = 0;
    int num= String.valueOf(a).length();
    
    while(a!=0) {
    	int i = a%10;
    	a=a/10;
    	sum += Math.pow(i ,num);
    	
    	
    }
    System.out.println(sum);
   
    	if(sum== b) {
    		System.out.println("is a armstrong number");
    	}else {
    		System.out.println("Not a armstrong number");
    	}
    	
    	sc.close();
    }



}
