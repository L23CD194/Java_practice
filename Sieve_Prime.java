package com.practice_package;
import java.util.*;
public class Sieve_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size to get prime numbers");
     int size = sc.nextInt();
     boolean [] arr = new boolean[size+1];
     Arrays.fill(arr, true);
     arr[0] = false;
     arr[1] = false;
    for(int i=2;i*i<=size;i++)
    {
    	if(arr[i])
    	{
    		for(int j = i*i;j<=size;j+=i)
    		{
    			arr[j] = false;
    		}
    	}
    }
    for(int i=2;i<=size;i++)
    {
    	if(arr[i])
    	System.out.println(i);
    }
	}
}
