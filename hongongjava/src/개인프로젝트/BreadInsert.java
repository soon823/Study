package 개인프로젝트;

import java.sql.SQLException;

public class BreadInsert extends Dao {
	
	//레시피등록
	public int insert(Bread bd) {
		getOpen();
		
		String sql = ""
					+"insert into bread (bname,stuff,recipe) "
					+"values(?, ?, ?) ";
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, bd.getBname());
			pstm.setString(2, bd.getStuff());
			pstm.setString(3, bd.getRecipe());
			
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
