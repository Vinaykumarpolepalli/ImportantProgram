package ImportantPrograms;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		String s = sc.next();
		int len = (s.length() / 2) - 1;
		String s1 = "";
		String s2 = "";
		if (s.length() % 2 == 0) {
			for (int i = 0; i <= len; i++) {

				s1 += s.charAt(i);
			}
			for (int i = len + 1; i < s.length(); i++) {
				s2 += s.charAt(i);
			}
			int num1 = Integer.parseInt(s1);
			int num2 = Integer.parseInt(s2);
			int sum = num1 + num2;
			if (Integer.parseInt(s) == sum * sum) {
				System.out.println("yes it is a tech number");
			} else {
				System.out.println("not a tech number");
			}
		}
		sc.close();
	}
	
}
