package com.practice_package;
import java.util.Scanner;
public class Swap_Temp {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 numbers to swap");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
System.out.println("Before Swapping : "+n1+ " "+n2);
int temp = n1;
n1 = n2;
n2 = temp;
System.out.println("After Swapping : "+n1+ " "+n2);
}
}