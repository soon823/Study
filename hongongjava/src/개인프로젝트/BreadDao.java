package 개인프로젝트;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BreadDao extends Dao {
	
	private static BreadDao instance = new BreadDao();
	private BreadDao() {}
	public static BreadDao instance() {
		return instance;
	}

	//레시피 조회
	List<Bread> BreadList(){
		getOpen();
		
		String sql = ""
					+"select bname"
					+", 	stuff"
					+", 	recipe "
					+"from bread ";
		List<Bread> result = new ArrayList<>();
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Bread bd = new Bread();
				
				bd.setBname(rs.getString("bname"));
				bd.setStuff(rs.getString("stuff"));
				bd.setRecipe(rs.getString("recipe"));
				
				result.add(bd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getClose();
		return result;
	}//end BreadList
	
	//레시피삭제
		public int delete(String name) {
			getOpen();
			
			String sql = ""
						+"delete "
						+"from bread "
						+"where bname = ? ";
			try {
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, name);
				
				int rows = pstm.executeUpdate();
				return rows;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			getClose();
			return 0;
		}//end delete
	
}//end Class
