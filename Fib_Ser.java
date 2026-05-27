package com.practice_package;
import java.util.Scanner;
public class Fib_Ser {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size to print fibonacii series ");
	System.out.println();
	int size = sc.nextInt();
	int prev = 0;
	int cur = 1;
	System.out.print("Fibonacii series : "+ prev + " " + cur+" ");
	while((size-2) > 0)
	{
		int next = prev + cur;
		System.out.print(next + " ");
		prev = cur;
		cur = next;
		size--;
	}
}
}
