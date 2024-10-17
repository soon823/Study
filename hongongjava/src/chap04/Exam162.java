package chap04;

public class Exam162 {

	public static void main(String[] args) {
		// 주사위 2개를 던져서 합이 5가되면 종료 - GAME OVER출력
		// 5가 아니면 (1,3) 주사위 눈 표시
		// 몇번만에 나오는지?
		
		int check = 0;
		while(true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.printf("(%d,%d) ",dice1,dice2);
			check ++;
			if(dice1 + dice2 == 5) {
				System.out.println("\nGAME OVER - 시도한 수 : " + check);
				break;
			}
		}
		
		//주사위 눈이 1이면 1등 ~6이면 6등 출력
		
		
		while(true) {
			int dice3 = (int)(Math.random() * 6) + 1;
			System.out.println("주사위 눈은 : " + dice3);
			if(dice3 == 6) {
				System.out.println("6등");
			}else if(dice3 ==5){
				System.out.println("5등");
			}else if(dice3 ==4){
				System.out.println("4등");
			}else if(dice3 ==3){
				System.out.println("3등");
			}else if(dice3 ==2){
				System.out.println("2등");
			}else {
				System.out.println("1등");
			}break;
		}
		
		//switch로 작성
		int dice4 = (int)(Math.random() * 6) + 1;
		System.out.println("주사위 눈은 : " + dice4);
		switch(dice4) {
		case 1 : System.out.println("1등"); break;
		case 2 : System.out.println("2등"); break;
		case 3 : System.out.println("3등"); break;
		case 4 : System.out.println("4등"); break;
		case 5 : System.out.println("5등"); break;
		case 6 : System.out.println("6등"); break;
		default : System.out.println("잘못 입력 되었습니다."); 
		}
		
		//한문장으로 끝낼수 있음
		
		int dice5 = (int)(Math.random() * 6) + 1;
		System.out.println("주사위 눈은 : " + dice5);
		System.out.println(dice5 + "등");
		
		//50에서 100까지 수를 발생
		//90 이상이면 A, 80 이상이면 B, ~ 60 이상이면 D, 나머지는 F
		//switch로 작성
		
		int su = (int)(Math.random() * 51) + 50;
		System.out.println("숫자는 : " + su);
		switch (su / 10) {
		case 10 : 
		case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6 : System.out.println("D"); break;
		default : System.out.println("F");
		}
		

	}//end main

}//end class
