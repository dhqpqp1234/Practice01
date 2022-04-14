package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("반지름을 입력하세요:");
		final float pi =  3.14F;
		float  won = sc.nextFloat();
		
		System.out.println("원의 넓이는 "+pi*won*won);
		sc.close();
	}
}
