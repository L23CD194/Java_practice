package com.practice_package;
import java.util.Scanner;
public class Rev_Num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to reverse it");
int num = sc.nextInt();
int rev = 0;
System.out.println("Original number: "+num);
for(int i = 1; i <= num; i++)
{
int digit = num % 10;
rev = rev * 10 + digit;
num = num / 10;
}
System.out.println("Reverse number : "+rev);
	}

}
