package ImportantPrograms;

import java.util.Scanner;

public class TablesCalulation {

	public static void main(String[] args) {
		System.out.println("main Method is stared ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("upto where to want ");
		int b = sc.nextInt();
		
		for(int i = 1; i<=b;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
sc.close();
	}

}
