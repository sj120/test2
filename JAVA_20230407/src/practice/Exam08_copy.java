package practice;

import java.util.Scanner;

public class Exam08_copy {

	public static void main(String[] args) {
		System.out.println("당신의 주민번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장 ( ?????? - ???????
	
		switch(gender) {
		case '1' :   case '3' : 
			System.out.println("당신은 남자입니다.");
			break;
		case '2' :  case '4' :
				System.out.println("당신은 여자입니다.");
			break;
		default:
					System.out.println("오류입니다.");}
	}

}
