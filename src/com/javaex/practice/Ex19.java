package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		long light1 = 300000; 
		long year = 365;
		long hours = 24;
		long minit = 60;
		long secon = 60;
		System.out.println("빛이 1년 동안 가는 거리는 "+secon*minit*hours*year*light1+"KM 입니다.");
		
		sc.close();
	}
}
