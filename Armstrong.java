package com.practice_package;
import java.util.Scanner;
public class Armstrong{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to check Armstrong: ");
int org = sc.nextInt();                                                                                                   
int temp1 = org;
int temp2 = org;
int rev = 0;
int n = 0;
int digit = 0;
while(temp1 > 0)
{
int d = temp1 % 10;
n++;
temp1 = temp1 / 10;
}
while(temp2 > 0){
digit = temp2 % 10;
int power = 1;
for(int i = 1; i <= n; i++)
{
power = power * digit;
}
rev = rev + power;
temp2 = temp2 / 10;
}
if(org == rev)
{
System.out.println("The Given number " + org + " is a Armstrong");
}
else
{
System.out.println("the Given number " + org + " is not a Armstrong");
}
}
} 
