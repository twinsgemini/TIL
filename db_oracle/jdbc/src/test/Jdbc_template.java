package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JdbcUtil;

public class Jdbc_template {
	public static void main(String[] args) {
		
		
		
		
		
	}
	
	// JDBC Template
	public void temp() {  // temp > 검색:select,등록:insert,수정:update,삭제:delete
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		String sql = "select ~~~";
		
		try {
			con = JdbcUtil.GetConnection();
			ps = con.prepareStatement(sql);
			// ? 값 세팅 작업
			rs = ps.executeQuery(); // select 구문 처리 함수
			row = ps.executeUpdate(); // DML 구문 처리 함수
			
			// 결과값 처리
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(con, ps, rs);
		}
		
		
	}
}
