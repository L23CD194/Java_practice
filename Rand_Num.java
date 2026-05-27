package com.practice_package;
import java.util.Random;
public class Rand_Num {
public static void main(String[]args) {
	Random r = new Random();
	int n=r.nextInt(101);
	System.out.println(n);
}
}
