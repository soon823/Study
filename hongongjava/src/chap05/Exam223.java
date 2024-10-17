package chap05;

import java.util.Scanner;

public class Exam223 {

	public static void main(String[] args) {
		// 확인문제 6번
		
		boolean run = true;
		int studentNo = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 : ");
			
			int sel = Integer.parseInt(scanner.nextLine());
			
			switch(sel) {
			case 1 : System.out.print("학생수 : ");
					 studentNo = Integer.parseInt(scanner.nextLine());	
					 scores = new int[studentNo];
					 break;
			case 2 : for(int i=0; i < studentNo; i++) {
						System.out.printf("scorse[%d] : ",i);
						scores[i] = Integer.parseInt(scanner.nextLine());
					}
					break;
			case 3 : for(int i=0; i < studentNo; i++) {
					 	System.out.printf("scorse[%d] : %d\n",i,scores[i]);				 
					}
					break;
			case 4 : int sum = 0;
					 int max = 0;
					 double avg = 0;
					 for(int i=0; i < studentNo; i++) {
						sum += scores[i];
						if(max < scores[i]) max = scores[i];
					 }
					 avg = (double)sum / studentNo;
					 System.out.printf("최고 점수 : %d\n평균 점수 : %f\n",max,avg);
					break;
			case 5 : run = false; break;
			default : System.out.println("숫자를 다시 입력해주세요");
			}
		}System.out.println("프로그램 종료");
		
	}

}
