package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 1) "이름: 이순신" 출력
		System.out.println("이름: 이순신");
		
		// 2) "나이: " 출력
		System.out.print("나이: ");
		
		// 3) 정수형 숫자 입력
		int age = sc.nextInt();
		
		// 4) "키: " 출력
		System.out.print("키: ");
		
		// 5) 실수형 숫자 입력
		double height = sc.nextDouble();
		/*
			====================
			이름: 이순신
			나이: 25세
			키: 176.5cm
			====================
		 */
		System.out.println("====================");
		System.out.println("이름: 이순신");
		System.out.printf("나이: %d세\n", age);
		System.out.printf("키: %.1fcm\n", height);
		System.out.println("====================");
		
		sc.close();
	}

}
