package com.practice_package;
import java.util.Scanner;
public class Pow_Num {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Base and Exponent to caluculate power");
	int base = sc.nextInt();
	int exp = sc.nextInt();
	int power = 1;
	while(exp > 0)
	{
		power = power * base;
		exp--;
	}
	System.out.println(power);
}
}
