package com.practice_package;
import java.util.Scanner;
public class Mul_Tab {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to generate multiplication table");
int n = sc.nextInt();
for(int i = 1; i < 11; i++)
{
	System.out.println(+n+" * "+ i + " = "+n*i);
}
	}

}
