package com.practice_package;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to find its factors");
int n = sc.nextInt();
System.out.print("Factors of  "+n+" are : ");
if(n == 0)
{
    System.out.println("0 has infinite factors");
    return;
}
for( int i = 1; i*i <= n; i++)
{
	if(n % i == 0)
	{
		System.out.print(i+" ");
		if(i != n/i)
		{
			System.out.print(n/i +" ");
		}
	}
}
	}

}
