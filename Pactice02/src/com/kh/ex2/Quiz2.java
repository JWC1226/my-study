package com.kh.ex2;

public class Quiz2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.printf("교환 전: a = %d, b = %d\n", a, b);
		
		int x = a;
		a = b;
		b = x;
		// a 의 값에 b 를 넣으면, 이전의 a 의 값이 없어지므로 x 라는 변수를 추가해야한다.
		System.out.printf("교환 후: a = %d, b = %d\n", a, b);
	}

}
