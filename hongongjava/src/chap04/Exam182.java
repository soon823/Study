package chap04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam182 {

	public static void main(String[] args) {
		// 2번
		//3번
		
		//4번 중첩 for 문을 이용하여 밑에 방정식의 모든 해를 구해서(x,y)형태로 출력해보세요 단, x와 y는 10이하의 자연수입니다.
		//(4 * X) + (5 * Y) == 60
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if((4*x)+(5*y) == 60) {
					System.out.printf("(%d,%d)",x,y);
				}
			}
		}
		
		//5번 for 문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보시오
		//*
		//**
		//***
		//****
		System.out.println();
		
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		char sta = '*';
		System.out.printf("%s\n%s%2s\n%s%2s%3s\n%s%2s%3s%4s\n",sta,sta,sta,sta,sta,sta,sta,sta,sta,sta);
		
		//6번 for 문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보시오
		//   *
		//  **
		// ***
		//**** 
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		String stars = "";
		for(int i=1; i<5; i++) {
			stars += "*";
			System.out.printf("%4s\n",stars);
		}
		
		//7번
		boolean run = true;
		int balance = 0;						//은행 잔고
		Scanner sc = new Scanner(System.in);
		
		esc:while(run) {
			//메뉴
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			//메뉴선택
			System.out.print("선택> ");
			int selNo = Integer.parseInt(sc.nextLine());
			
			switch(selNo) {
			case 1 : System.out.print("예금액 : ");
					 balance += Integer.parseInt(sc.nextLine());
					 break;
			case 2 : System.out.print("출금액 : ");
					 int money = Integer.parseInt(sc.nextLine());		//위에처럼 따로 int 안써도 되지만 밑에 if 문을 쓰기 위해 지정 
					 if(balance < money) {
						 System.out.println("잔고 부족");
						 System.out.println("출금 가능액 : " + balance);
					 }else {
						 balance -= money;
					 }
					 break;
			case 3 : System.out.println("잔고>" + balance);
					 break;
			case 4 : break esc;									//while 문을 종료
			default : System.out.println("다시 선택 해주세요.");
			}
		}
		System.out.println("프로그램 종료");
		
		//세자리 콤마
		double num = 26000000;
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println(df.format(num));
		
		

	}//end main

}//end class
