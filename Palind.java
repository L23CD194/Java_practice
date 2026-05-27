package com.practice_package;
import java.util.Scanner;
public class Palind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome or not");
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		if(n < 0)
			n = -n;
		if(temp < 0)
			temp = - temp;
		while(temp != 0)
		{
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
       if(n == rev)
       {
    	   System.out.println(+n+" is Palindrome");
       }
       else
       {
    	   System.out.println(+n+" is not Palindrome");
       }
	}

}
