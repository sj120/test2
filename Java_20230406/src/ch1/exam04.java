package ch1;

import java.util.Scanner;

//성적을 입력 받아서 70이상이면 "합격했습니다. 메시지 출력"
public class exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int jumsu =	sc.nextInt();
		
				//조건문 If
		if(jumsu >= 70)  //if 뒤엔 ;을 붙이지 않는다 - 아직 문장이 미완성이기 때문, 조건문은 완성되었지만 그에 따른 결과가 x
			System.out.println("당신은 합격했습니다.");
		else
			System.out.println("당신은 불합격했습니다.");
		
		    System.out.println("프로그램 종료");
		    
		    //나이 입력 받아서 20살 이상이면 성년, 미만이면 미성년
		    
		    //int age = sc.nextInt();
		    
		    //if (age>=20)
		    	//System.out.println("성년");
		    
		    //System.out.println("미성년");
	}

}

