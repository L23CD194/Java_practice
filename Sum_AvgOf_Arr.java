package com.practice_package;
import java.util.Scanner;
public class Sum_AvgOf_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of array");
int n = sc.nextInt();
int [] arr = new int[n+1];
int sum = 0;
System.out.println("Enter elements of array");
for(int i = 0; i < n; i++)
{
	arr[i] = sc.nextInt();
	sum = sum + arr[i];
}
int avg = sum / n;
System.out.println("Sum of Array elements : "+sum+ " \nAverage of Array elements : "+avg);
	}
}
