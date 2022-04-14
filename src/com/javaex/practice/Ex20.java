package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 500, b = 100, c = 50, d = 10;
		
		System.out.print("500원 개수:");
		int a1 =  sc.nextInt()*a;
		System.out.print("100원 개수:");
		int b1 = sc.nextInt()*b;
		System.out.print("50원 개수:");
		int c1 = sc.nextInt()*c;
		System.out.println("10원 개수");
		int d1 = sc.nextInt()*d;
		
		System.out.println("동전의 총합은 "+(a1+b1+c1+d1)+" 원 입니다.");
		
		sc.close();
	}
}
