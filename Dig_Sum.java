package com.practice_package;
import java.util.Scanner;
public class Dig_Sum {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to find its digits sum");
int n = sc.nextInt();
int sum = 0;
while(n > 0)
{
	int digit = n % 10;
	sum = sum + digit;
	n = n / 10;
}
System.out.println("Digits sum of given number : "+sum);
	}

}
