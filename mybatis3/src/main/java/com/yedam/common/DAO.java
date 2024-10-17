package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	// 다른페키지에서 사용하기위해 public
	public Connection conn = null;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	// 1.연결설정 메소드 : 메소드 (void)
	public void getOpen() {
		try {
			// jdbc 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", // url
					"java", // 계정
					"1234"); // 비밀번호
//			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 2.연결끊기 메소드 : 메소드 (void)
	public void getClose() {
		if (conn != null) {
			try {
				conn.close();
//				System.out.println("연결끊기");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
