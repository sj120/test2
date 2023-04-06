package ch1;

import java.util.Scanner;

public class test_copy {

	public static void main(String[] args) {
		Scanner sc = new scanner(system.in);
		
		int kor, eng, math, total;
	
		double average ;
		
		System.out.println("국어점수>>");
		kor = sc.nextInt();
		System.out.println("영어점수>>");
		eng = sc.nextInt();
		System.out.println("수학점수>>");
		//math = sc.nextInt();
		String str = sc.nextLine(); // 90 -> "90"
		math = Integer.parseInt(str); // "90"==>90
		

	}

}
