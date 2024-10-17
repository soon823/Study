package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BkMain {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"java",
					"1234"
					);
			System.out.println("연결성공");
			
			Scanner sc = new Scanner(System.in);
			boolean run = true;
			
			while(run) {
				System.out.println("--------------------------------------------------------");
				System.out.println("1.도서등록 2.도서검색 3.도서전체 4.도서삭제 5.도서 정보 변경 6.종료");
				System.out.println("--------------------------------------------------------");
				
				System.out.print("메뉴선택 : ");
				int check = Integer.parseInt(sc.nextLine());
				
				switch(check) {
				case 1 :System.out.println("[도서등록]");
						String sql = "" 
									+ "insert into book (title,writer,bnum,price) "
										+ "values(?, ?, ?, ?)";
						PreparedStatement pstmt = conn.prepareStatement(sql);
						System.out.print("책 제목 : ");
						pstmt.setString(1, sc.nextLine());
						System.out.print("작가 : ");
						pstmt.setString(2, sc.nextLine());
						System.out.print("책 번호 : ");
						pstmt.setString(3, sc.nextLine());
						System.out.print("가격 : ");
						pstmt.setInt(4, Integer.parseInt(sc.nextLine()));
						
//						System.out.print("책 제목 : ");
//						String title = sc.nextLine();
//						System.out.print("작가 : ");
//						String writer = sc.nextLine();
//						System.out.print("책 번호 : ");
//						String bum = sc.nextLine();
//						System.out.println("책 가격 : ");
//						int price = Integer.parseInt(sc.nextLine());
						
						
						
						break;
				case 2 : 
					
				case 3 : 
					
				case 4 : 
					
				case 5 : 
					
				case 6 :System.out.println("프로그램 종료"); return;
					
				default : System.out.println("번호를 다시 선택해주세요"); break;
				}
				
				
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결끊기");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
