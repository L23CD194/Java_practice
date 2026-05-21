package com.practice_package;
import java.util.Scanner;
public class Rev_Str {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to reverse it");
	String str = sc.nextLine();
	System.out.println("Original String : "+str);
	String rev = " ";
	for(int i = str.length()-1;i >= 0; i--)
	{
		rev = rev + str.charAt(i);
	}
	System.out.println("Reverse String : "+rev);
}
}
