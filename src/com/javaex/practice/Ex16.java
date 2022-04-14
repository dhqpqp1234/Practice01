package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격:");
		double money = sc.nextDouble();
		System.out.print("받은돈:");
		double money2 = sc.nextDouble();
		System.out.println("받은돈:"+money);
		System.out.println("상품가격:"+money2);
		System.out.println("부가세:"+money/10);
		System.out.println("잔액:"+(money2-money));
		
		
		sc.close();
	}
}
