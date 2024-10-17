package 권순범;

import java.util.Scanner;

public class Doself {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1.윤년 계산 프로그램 
		//- 입력된 년도가 윤년인지 계산하는 프로그램 작성 
		//- 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년 
		//- 400으로 나누어 떨어지면 윤년 
		
		System.out.print("년도 입력 : ");
		int year = Integer.parseInt(sc.nextLine());	
		if((year %4 == 0 && year %100 != 0) || year %400 == 0) {		
				System.out.println(year+"년은 윤년입니다");				
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
		
		//2.동전 교환 프로그램 
		//- 입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해 주는 프로그램 작성 
		//- 동전의 총개수는 최소화  
		//- 고액의 동전 먼저 교환 
		
		System.out.print("교환할 금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		int coin500 = money / 500;
		int coin100 = (money % 500) / 100;
		int coin50 = (money % 500 % 100) / 50;
		int coin10 = (money % 500 % 100 % 50) / 10;
		int trash = money % 500 % 100 % 50 % 10;
		System.out.printf("500원짜리 : %d개\n100원짜리 : %d개\n50원 짜리 : %d개\n10원 짜리 : %d개\n교환 금액 : %d원\n남은 금액 : %d원\n", coin500,coin100,coin50,coin10,money,trash);
		
//		System.out.print("교환할 금액 : ");
//		int money = Integer.parseInt(sc.nextLine());
//		int remain = money;
//		int coin500 = money / 500;
//		remain = remain % 500;
//		int coin100 = remain / 100;
//		remain = remain % 100;
//		int coin50 = remain / 50;
//		remain %= 50;
//		int coin10 = remain / 10;
//		remain %= 10;
//		System.out.printf("500원짜리 : %d개\n100원짜리 : %d개\n50원 짜리 : %d개\n10원 짜리 : %d개\n교환 금액 : %d원\n남은 금액 : %d원\n", coin500,coin100,coin50,coin10,money,remain);

		//3. 추측 게임 
		//• 1에서 100까지의 수를 발생 시키고 어떤 수인지 알아 맞히는 게임 프로그램 작성 
				
		int random = (int)(Math.random()*100)+1;
		System.out.println(random);
		while(true) {
			System.out.print("숫자 입력 : ");
			int su = Integer.parseInt(sc.nextLine());
			if(random > su) {
				System.out.println("up하세요");
			}else if(random < su) {
				System.out.println("down하세요");
			}else {
			System.out.println("축하합니다!!");break;
			}
		}
		
		//4.구구단 프로그램
		
		for(int i=2;i<10;i++) {
			System.out.print(i+"단	");
		}
		for(int i=1;i<10;i++) {
			System.out.println();
			for(int j=2;j<10;j++) {
				System.out.printf("%dX%d=%d\t",j,i,(i*j));
			}
		}
	
		//5.섭씨-화씨 온도 변환 프로그램 
		
		boolean run = true;
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1. 화씨 +> 섭씨");
			System.out.println("1. 섭씨 +> 화씨");
			System.out.println("3. 종료");
			System.out.println("---------------------------");
			
			System.out.print("▶ 번호선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			 
			switch(num) {
			case 1 : System.out.print("▶ 화씨온도입력 : "); 
					 int ondo = Integer.parseInt(sc.nextLine());
					 double sub = (double)5 / 9 * (ondo - 32);
					 System.out.printf("섭씨온도 = %.6f\n",sub); break;
			case 2 : System.out.print("▶ 섭씨온도입력 : "); 
			  		 ondo = Integer.parseInt(sc.nextLine()); 
			  	 	 double hwa = (double)9 / 5 * ondo + 32;
					 System.out.printf("화씨온도 = %.6f\n",hwa); break;
			case 3 : run = false; break;
			default : System.out.println("똑디 입력해 주세요");
			}
		}System.out.println("PROGRAM END");
		
		//6.가위,바위, 보 게임 프로그램 
		//• 가위 바위 보 중에 하나를 선택하면, 컴퓨터가 생성한 난수값과 비교하여 누가 이겼는지 화면에 출력하는 프로그램 작성 
		//• 2보다 큰 수  입력하면 game over 출력 => 종료 
		
				
		while(true) {
			
			int com = (int)(Math.random()*3);		
			System.out.print("가위(0) 바위(1) 보(2) : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num - com == 1 || num - com == -2) {
				System.out.printf("사람 %d, 컴 %d 사람 승리\n",num,com);				
			}else  if(com - num == 1 || com - num == -2) {
				System.out.printf("사람 %d, 컴 %d 컴 승리\n",num,com);
			}else if(com == num){
				System.out.printf("사람 %d, 컴 %d 비겼음\n",num,com);
			}			
			if(num >= 3) {
				break;
			}
//			switch(num) {
//			case 0 :System.out.printf("사람 %d, 컴 %d \n",num,com);
//					break;
//			case 1 :System.out.printf("사람 %d, 컴 %d \n",num,com);
//					break;
//			case 2 :System.out.printf("사람 %d, 컴 %d \n",num,com);
//					break;
//			default : start = false; break;								
//			}
			
		}System.out.println("GAME OVER");
		
		//7.3, 6, 9게임 프로그램 
		//• 1~50까지 3, 6, 9가 들어가는 숫자마다 3, 6, 9가 들어가 있는 개수 만큼 ♥출력하는 프로그램 작성 
		
		String temp1 = "";
		for(int i=1; i<=50; i++) {
			if(i%10==3 || i%10==6 || i%10==9) {
				temp1 += "♥";
			}
			if(i/10==3 || i/10==6 || i/10==9) {
				temp1 += "♥";
			}
			if(temp1.equals("")) {
				temp1 = String.valueOf(i);
			}
			if(i%10!=0) {
				System.out.print(temp1+"\t");
			}else {				
				System.out.print(temp1+"\n");
			}
			temp1 = "";
		}
		
		sc.close();
		
		//크롬에 백준 검색후 사이트 가서 문제 풀어보기(쉬운문제 부터 어려운문제까지 다양함)
	}//end main

}//end class //랜덤수 생성은 최대값-최소값+1 
