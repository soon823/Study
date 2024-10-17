package 개인프로젝트;

import java.sql.SQLException;

public class JoinDao extends Dao {
	
	//회원가입
	public int insert(Rog rog) {
		getOpen();
		
		String sql = ""
					+"insert into rog (mid, mpw, mname, tell) "
					+"values(?, ?, ?, ?)";
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, rog.getMid());
			pstm.setString(2, rog.getMpw());
			pstm.setString(3, rog.getMname());
			pstm.setString(4, rog.getTell());
			
			int rows = pstm.executeUpdate();
			return rows;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		getClose();
		return 0;
	}//end insert
	
}//end Class
