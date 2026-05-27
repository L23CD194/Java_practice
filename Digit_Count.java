package com.practice_package;
import java.util.Scanner;
public class Digit_Count {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number to count its no.of digits");
	int n = sc.nextInt();
	int c = 0;
	 if(n == 0)
     {
         System.out.println("Digits count is : 1");
         return;
     }
	while(n > 0)
	{
		n = n / 10;
		c++;
	}
	System.out.println("Digits count is : "+c);
}
}
