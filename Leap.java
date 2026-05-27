package com.practice_package;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a year to check leap year or not");
int year = sc.nextInt();
if(year <= 0)
{
    System.out.println("Invalid year");
}
else if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
{
	System.out.println(+year+" is a leap year");
}
else
{
	System.out.println(+year+" is not a leap year");
}
	}

}
