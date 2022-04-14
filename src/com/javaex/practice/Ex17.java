package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main (String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		final double pi = 3.14;
		System.out.print("반지름:");
		double half = sc.nextDouble();
		System.out.print("구의부피는: "+4.0/3.0*pi*half*half*half);
		
		
		sc.close();
	}
}
