package com.practice_package;
import java.util.Scanner;
public class LCM_By_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 numbers to find Least Common Factor(LCM)");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int num1 = n1;
int num2 = n2;
int gcd = 1;
if(n1 == 0 || n2 == 0)
{
    System.out.println("LCM : 0");
    return;
}
while(n2 != 0)
{
	int rem = n1 % n2;
	n1 = n2;
	n2 = rem;
}
gcd = n1;
int lcm = (num1 * num2) / gcd;
System.out.println("LCM of 2 numbers : "+lcm);
	}

}
