package com.practice_package;
import java.util.Scanner;
public class GCD_Euc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 numbers to find GCD");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int gcd = 1;
while(n2 != 0)
{
	int rem = n1 % n2;
	n1 = n2;
	n2 = rem;
}
gcd = n1;
System.out.println("GCD of given numbers : "+gcd);
	}

}
