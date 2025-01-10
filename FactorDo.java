package ImportantPrograms;

import java.util.Scanner;

public class FactorDo {
	

	public static void main(String[] args) {
		System.out.println("Main method is started ! ");
		Scanner sc = new Scanner(System.in);
		String  option= "";
		//System.out.println(a);
	
	 
	
	do {
		
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		
		
		for(int i = 1;i <=a/2; i++) {
			if(a%i==0 ) {
				System.out.println(i);	
			
			}
			
		}
		
		//System.out.println(a);
		System.out.println("If you want to repeat in it agin please enter yes or no ");
		option=sc.next();
		
		
	}while(option.equalsIgnoreCase("yes"));
	
	
	
    sc.close();
    
	}

}
