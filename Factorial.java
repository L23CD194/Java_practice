package com.practice_package;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to find its factorial");
int n = sc.nextInt();
int res = 1;
for(int i = 1; i <= n;i++)
{
	res = res * i;
}
System.out.print(res);
	}

}
