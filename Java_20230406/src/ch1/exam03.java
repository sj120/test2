package ch1;

import java.util.Scanner;

public class exam03 {
/*나의 이름, 주소 , 나이(만으로 입력)를 입력 받아서 출력하는 프로그램 작성.. (단 나이는 +1해서 출력) 
	*/
	public static void main(String[] args) {
    
		Scanner sn = new Scanner(System.in);
        
		//nextline, nextInt
		
		String name = sn.nextLine();
		String address = sn.nextLine();    //next Line 같은 경우, 문장 전체를 입력가능.
		double age = sn.nextInt();
		
		/// 나중에 If (age >2 ) 
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + (age+1));
	}

}
