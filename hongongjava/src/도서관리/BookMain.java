package 도서관리;

import java.util.List;
import java.util.Scanner;

public class BookMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		MemberDao mdao = MemberDao.getInstance();
		Member member = null;
		
		//로그인 체크
		while(true) {
			System.out.println("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력 : ");
			String pw = sc.nextLine();
			
			//정상적으로 로그인 되면 "홍길동" 환영 메세지
			member = mdao.checkMember(id, pw);
			if(member != null) {
				System.out.println(member.getMemberName()+" 환영합니다");
				break;
			}
			System.out.println("아이디와 비밀번호를 확인하세여!");
		}	//end of 로그인체크
			
		if(member.getResponsibility().equals("User")) {
			//권한이 User => 도서관리 처리
			bookManage();
		}else if(member.getResponsibility().equals("Admin")) {
			//권한이 Admin => 회원관리 처리
			memberManage();
		}

	}//end of main
	
	static void bookManage() {		//도서관리
		
		BookDao dao = null;
		boolean run = true;
		int cnt = 0;
		
		// 메인메뉴
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.도서등록 2.도서검색 3.도서전체 4.도서삭제 5.도서 정보 변경 6.종료");
			System.out.println("--------------------------------------------------------");
			
			System.out.print("메뉴선택 : ");
			int check = Integer.parseInt(sc.nextLine());
			
			switch(check) {
			// 선택1번 : 도서등록
			case 1 :System.out.println("[도서등록]");
			 		System.out.print("책 제목 : ");
			 		String title = sc.nextLine();
			 		System.out.print("작가 : ");
			 		String writer = sc.nextLine();
			 		System.out.print("책 번호 : ");
			 		String bnum = sc.nextLine();
			 		System.out.print("책 가격 : ");
			 		int price = Integer.parseInt(sc.nextLine());
			 		
			 		Book book = new Book(title, writer, bnum, price);
			 		dao = new BookDao();
			 		cnt = dao.insert(book);
					break;
			// 선택2번 : 도서검색 => 책 제목으로 검색 
			case 2 :
					break;
			// 선택3번 : 도서전체 조회
			case 3 :System.out.println("[도서전체 조회]");
					dao = new BookDao();
					List<Book> bList = dao.bookList();
					for(Book li : bList) {
						System.out.println(li);
					}
					break;
			// 선택4번 : 도서삭제
			case 4 :
					break;
			// 선택5번 : 도서 정보 변경 (책 재목 : 변경할 책 번호, 변경할 책 가격 입력 => 수정)
			case 5 :
					break;
			
			// 선택6번 : 프로그램 종료
			case 6 :System.out.println("프로그램 종료"); return;
			default : System.out.println("다시 선택 해주세요"); break;
			}
			
			
		}//end of while
	}//end of bookManage
	
	static void memberManage() {	//회원관리
		System.out.println("관리자 메뉴입니다");
		// 선택6번 회원목록 출력
		MemberDao mdao = MemberDao.getInstance();
		Member member = null;
					
		List<Member> list = mdao.memberList();
		System.out.println("---------------------------");
		System.out.println("회원목록");
		System.out.println("---------------------------");
		for(Member member1 : list) {
		System.out.println(member1.toString());
		}
							
	}

}
