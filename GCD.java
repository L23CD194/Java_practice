package com.practice_package;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 numbers to find Highest Common Factor(HCF)");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int gcd = 1;
if(n1 < n2)
{
	for(int i = 1; i <= n1;i++)
	{
		if(n1 % i == 0 && n2 % i == 0)
		{
			gcd = i;
		}
	}
}
if(n2 < n1)
{
	for(int j = 1;j <= n1;j++)
	{
		if(n1 % j == 0 && n2 % j == 0)
		{
			gcd = j;
		}
	}
}
System.out.print(gcd);
	}
}
