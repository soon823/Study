package chap08;

public class DaoMain {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		
	}

	static void dbWork(DataAccessObject Dao) {
		Dao.select();
		Dao.insert();
		Dao.update();
		Dao.delete();
	}

}
