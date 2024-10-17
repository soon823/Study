package 도서관리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao extends DAO{
	
		//필드
		//메소드
		

		
		
		//3.insert 메소드
		
		public int insert(Book book) {
			getOpen();
			
			String sql = "" 
						+ "insert into book (title,writer,bnum,price) "
						+ "values(?, ?, ?, ?)";
			
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, book.getTitle());
				pstmt.setString(2, book.getWriter());
				pstmt.setString(3, book.getBum());
				pstmt.setInt(4, book.getPrice());
				
				int rows = pstmt.executeUpdate();
				return rows;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			getClose();
			return 0;
		}
		
		//4.select 조건에 따른 검색(책 제목) 메소드
		
//		List<Book> book1List(){
//			String sql = ""
//						+ "select * "
//						+ "from book"
//						+ "where title=?";
//			List<Book> result = new ArrayList<>();
//			getOpen();
//			try {
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//				rs = pstmt.executeQuery();
//				pstmt.setString(0, rs.getTitle());
//				while(rs.next()) {
//					Book book1 = new Book();
//					book1.setTitle(rs.getString("Title"));
//					book1.setWriter(rs.getString("Writer"));
//					book1.setBum(rs.getString("Bnum"));
//					book1.setPrice(rs.getInt("Price"));
//					
//					result.add(book1);
//				}
//				rs.close();
//				pstmt.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		return result;
//	}
		
		//5.select 목록전체 조회 메소드
		
			List<Book> bookList(){
				String sql = ""
							+ "select * "
							+ "from book";
				List<Book> result = new ArrayList<>();
				getOpen();
				try {
					PreparedStatement pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					while(rs.next()) {
						Book book1 = new Book();
						book1.setTitle(rs.getString("Title"));
						book1.setWriter(rs.getString("Writer"));
						book1.setBum(rs.getString("Bnum"));
						book1.setPrice(rs.getInt("Price"));
						
						result.add(book1);
					}
					rs.close();
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return result;
		}

		
		
		//6.delete 메소드(북번호 이용)
		//7.update 메소드(책 제목의 가격과 책 번호 수정)
		
}

