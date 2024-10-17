package 도서관리;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// 목록(조회조건), 등록, 수정, 삭제, 단건.
public class MemberDao extends DAO {
	//Connection, getOpen, getClose 상속받음
	
	//싱글턴 방식
	private static MemberDao instance = new MemberDao();
	private MemberDao() {}
	public static MemberDao getInstance() {
		return instance;
	}
	
	
	//아이디와 비밀번호 확인해서 true 반환 / false 반환.  --> 회원이름 반환  -->권한추가
	Member checkMember(String id, String pw) {
		String sql = "select member_name, responsibility from tbl_member"
				+"	  where member_id = ? and password = ?";
		getOpen();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				Member member = new Member();
				member.setMemberName(rs.getString("member_name"));
				member.setResponsibility(rs.getString("responsibility"));
				
				return member;
//				if(cnt > 0) {		//id, pw 정상적이면 
//					return true;
//				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//목록조회
	List<Member> memberList(){
		String sql = "select member_id"
					+"		,member_name"
					+"		,password"
					+"		,phone"
					+"		,responsibility"
					+"		,creation_date"
					+"	from tbl_member ";
		List<Member> result = new ArrayList<>();
		getOpen();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();	//조회
			while(rs.next()) {
				Member member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setPassword(rs.getString("password"));
				member.setMemberName(rs.getString("member_name"));
				member.setPhone(rs.getString("phone"));
				member.setResponsibility(rs.getString("responsibility"));
				member.setCreationDate(rs.getDate("creation_date"));
				
				result.add(member);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("실패");
		}
		return result;
	}//end of memberList()
	
}
