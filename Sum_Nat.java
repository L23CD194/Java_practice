package com.practice_package;
import java.util.Scanner;
public class Sum_Nat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter size to find sum of natural numbers");
int size = sc.nextInt();
int sum = 0;
for(int i = 1; i <= size;i++)
{
	sum = sum + i;
}
System.out.println("Sum of naural number upto the size of : "+size+" is "+sum);
	}

}
