package chap06;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Book[] list = null;
		int booksu = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.도서 수 입력 2.도서 입력 3.도서목록 조회 4.도서분석 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("메뉴 선택 = ");
			int check = Integer.parseInt(sc.nextLine());
			
			switch(check) {
			case 1 :System.out.print("도서 수 입력 : ");				
					booksu = Integer.parseInt(sc.nextLine());
					list = new Book[booksu];
					break;
			case 2 :for(int i=0; i<booksu; i++) {
						System.out.print(i+1 + "번째 도서 입력\n");
						
						System.out.print("책 제목 입력 : ");
						String tittle = sc.nextLine();
						
						System.out.print("책 번호 입력 : ");
						int bookNum = Integer.parseInt(sc.nextLine());
						
						System.out.print("책 가격 입력 : ");
						int bookSel = Integer.parseInt(sc.nextLine());
						
						list[i] = new Book(tittle,bookNum,bookSel);
					}
					break;
			case 3 :System.out.println("도서목록 조회"); 
					for(Book book : list) {
						System.out.printf("책 제목:%s\n책 번호:%d\n책 가격%d\n",book.getBook(),book.getBookNum(),book.getBookSel());
					}
					break;
			case 4 :System.out.println("도서분석"); 
					int sum = 0;
					String title  = null;
					int max = Integer.MIN_VALUE;
					int min = Integer.MAX_VALUE;
					for(Book book : list){
						int p = book.getBookSel();
						sum += p;
						if(max < p) {
							max = p;
							title = book.getBook();
						}
						if(min > p) min = p;
					}
					System.out.printf("가격 합 :%d\n최고가격 : %d\n최소가격 : %d\n",sum,max,min);
					break;
			case 5 :System.out.println("종료"); return;
			default :System.out.println("다시 입력해주세요"); break;
			}
			
		}
		
		
	}//end main

}
