package 권순범;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Account[] list = new Account[100]; 
		
		Account ac = null;
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------");
			
			System.out.print("선택 : ");
			int check = Integer.parseInt(sc.nextLine());
			
			switch(check) {
			case 1 :System.out.println("----------");
					System.out.println("계좌생성");
					System.out.println("----------");
					
					System.out.print("계좌번호 : ");
					String ano = sc.nextLine();
					
					System.out.print("계좌주 : ");
					String owner = sc.nextLine();
					
					System.out.print("초기입금액 : ");
					int balance = Integer.parseInt(sc.nextLine());
					
					ac = new Account(ano,owner,balance);
					
					for(int i=0; i<list.length; i++) {
						if(list[i] == null) {
							list[i] = ac;
							break;
						}
					}
					
					System.out.println("결과: 계좌가 생성되었습니다");					
					break;
					
			case 2 :System.out.println("----------");
					System.out.println("계좌목록");
					System.out.println("----------");
					
					
						
//					System.out.print("계좌번호 : " + ac.getAno());
//						
//					System.out.print("계좌주 : " + ac.getOwner());
//						
//					System.out.println("초기입금액 : " + ac.getBalance());
						
					if(list[0]==null) {
						System.out.println("조회할수있는 계좌가 없습니다.");
						break;
					}
					for(Account pr:list) {
						if(pr != null) {
							System.out.printf("%s %s %d\n",pr.getAno(),pr.getOwner(),pr.getBalance());
						}
					}
					break;
					
					
			case 3 :System.out.println("----------");
					System.out.println("예금");
					System.out.println("----------");
					
//					System.out.print("계좌번호 : ");
//					ac.setAno(sc.nextLine());
//					
//					System.out.print("예금액 : ");
//					ac.setBalance(Integer.parseInt(sc.nextLine()));
					
					System.out.println("결과: 예금이 성공되었습니다");
					break;
					
			case 4 :System.out.println("----------");
					System.out.println("출금");
					System.out.println("----------");
			
					System.out.println("결과: 출금이 성공되었습니다");
					break;
					
			case 5 : System.out.println("프로그램 종료"); return;
			
			default : System.out.println("번호를 신중히 입려해주세요"); break;
			}
			
			
		}
		

	}//end main

}//end class
