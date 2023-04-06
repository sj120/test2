package ch1;

import java.util.Scanner;

// 정수 세개를 입력 받아서, 최댓값과 최소값을 구한다.
public class exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	///
		int a,b,c;
		int max, min;
		a = sc.nextInt();   // a 앞엔 int가 써져있음. 앞에 int 쓰면 중복이라 안됨
		b = sc.nextInt();
		c = sc.nextInt();

		if (a>b && a>c); a = max;
		
		//int num1, num2, num3;
		//int num1, num2, num3;
		//int max, min=0;
		//num1 = sc.nextInt();
		//num2 = sc.nextInt();
		//num3 = sc.nextInt();
		
		//최대값
		//if(num1>num2) {
			//if(num1>num3) max =num1;
			//else max = num3;
		//} else {
		//	if (num1>num3) max=num2;
		//	else max = num3;
		}
		
		//최소값
		//if(num1>num2) {
			//if(num2>num3) min = num3 ;
			//else min = num2;
		//} else {
		//	if(num1>num3) min = num3;
		//	else min = num1;
		//}
		
		
		//System.out.println("최대값 :" + max);
		//System.out.println("최대값 :" + min);
		//System.out.println("프로그램 종료");
	//}
	//}
	
// 3개의 정수를 입력받을 것이다, 3개를 서로 비교해야함