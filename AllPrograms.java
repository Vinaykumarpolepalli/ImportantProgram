package ImportantPrograms;

import java.util.Scanner;

public class AllPrograms {
	public static void main(String[] args) {
		
		System.out.println("Main method is started");
		Scanner sc = new Scanner(System .in);
			System.out.println("Enter a number");
			int a = sc .nextInt();
			int b = a;
			int sum  = 0;
			int value=String.valueOf(a).length();
			
			while(a!=0) {
				int i = a%10;
				a = a/10;
				sum +=Math.pow(i,value);
				
			
				
			}
			System.out.println(sum);
			if(sum== b) {
				System.out.println("Arm strong number");
				
			}else {
				System.out.println("not a armstrong number");
			}
		
	}
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	                                         //tablesCaluation
		
//	System.out.println("Main method is started");
//	Scanner sc = new Scanner(System .in);
//		System.out.println("Enter a number");
//		int a = sc .nextInt();
//		System.out.println("upto to where you want ");
//		int b = sc.nextInt();
//		
//		for(int i = 1;i<=b;i++) {
//			System.out.println(a+"*"+i+"="+a*i);
//		}
//			
//		
//	
//	
//	
//	
//	sc.close();
//	
//}
//
//}
	
                                             //palindrom
//	public static void main(String[] args) {
//		System.out.println("Main method is started");
//		Scanner sc = new Scanner(System .in);
//			System.out.println("Enter a number");
//			int a = sc .nextInt();
//			int temp = a;
//			int rem = 0;
//		    int reverse = 0 ;
//
//		while(a!=0) {
//			rem = a%10;
//			a = a/10;
//			reverse = reverse *10+rem;
//			
//			System.out.println(reverse);
//		}
//		
//		if(temp == reverse ){
//			System.out.println("It is a palindrom ");
//			
//		}else {
//			System.out.println("not a palindrom");
//		}
//		
//		sc.close();
//	}
//	
//}
			
                                              //perfect number

//		System.out.println("Main method is started");
//		Scanner sc = new Scanner(System .in);
//			System.out.println("Enter a number");
//			int a = sc .nextInt();
//			int sum = 0;
//			
//			for(int i =1;i <=a/2;i++) {
//				if(a%i==0) {
//				sum = sum +i;
//					System.out.println(sum);
//				}
//			}
//		
//			
//			sc.close();
//	}
//	
//}

	                                                  //factor	
//	System.out.println("Main method is started");
//	Scanner sc = new Scanner(System .in);
//		System.out.println("Enter a number");
//		int a = sc .nextInt();
//		
//		for(int i = 1;i<=a/2;i++) {
//			if(a%i==0) {
//				System.out.println(i);
//			}
//		}
//		
//		
//	}
	

//}

	                                               //sum of numbers
//		System.out.println("Main method is started");
//		Scanner sc = new Scanner(System .in);
//		System.out.println("Enter a number");
//		int a = sc .nextInt();
//		int rem = 0;
//		int sum = 0;
//		
//		while(a!=0) {
//			rem = a %10;
//			a = a/10;
//			sum = sum +rem;
//			
//		}
//		System.out.println("Sum of number is :"+sum);
//	sc.close();	
//
//	}
//
//}
