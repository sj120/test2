package practice;

import java.util.Scanner;

public class pr_6 {
  // 사용자로부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num =sc.nextInt();
    
	if(num>0) System.out.println("양수입니다.");
	else if(num==0) System.out.println("0입니다.");
	else System.out.println("음수입니다.");
	}

}
