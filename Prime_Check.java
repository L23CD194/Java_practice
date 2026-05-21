package com.practice_package;
import java.util.Scanner;
public class Prime_Check {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to check prime.");
int n = sc.nextInt();
if( n <= 1)
{
	System.out.println(n+" is not prime");
	return;
}
for(int i = 2; i*i <= n; i++)
{
	if(n%i == 0)
	{
		System.out.println(n+" is not prime");
		
	}
	else
	{
		System.out.println(n+" is prime");
		
	}
}
	}

}
