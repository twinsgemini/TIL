package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JdbcUtil;

public class Test02_emp {
	public static void main(String[] args) {
		System.out.println("JDBC TEST");
				
		String sql = "select * from emp where deptno = ?"; // ? : 변수 바인딩
		
		Connection con = null;
		PreparedStatement ps = null; // Statement는 sql변수의 ? 처리 불가능
		ResultSet rs = null; 
		// select문 실행시 나오는 테이블셋은 resultset으로 온다
		// insert update delete 결과의 리턴값은 int타입이다
		
		try {
			con = JdbcUtil.GetConnection();
			
			// 3. 생성된 Connection으로부터 Statement생성
			ps = con.prepareStatement(sql);

			String deptno = JOptionPane.showInputDialog("확인 할 deptno 입력");
				// ? 값 세팅
			ps.setInt(1, Integer.parseInt(deptno));
			
			// 4. 생성된 Statement를 이용해서 sql수행(execute, executeUpdate, executeQuery)
			rs = ps.executeQuery();
			
			// 5. 결과 처리(ResultSet, int)
			while(rs.next()) {
				System.out.print(rs.getString("empno")+" ");
				System.out.print(rs.getString("ename")+" ");
				System.out.print(rs.getInt("sal")+" ");
				System.out.print(rs.getDate("hiredate")+" ");
				System.out.print(rs.getString("deptno")+" ");
				System.out.println();
			}
					
			//System.out.println(con);
			
		} catch (Exception e) {
			// 6. SQLException 처리(try, catch, finally)
			System.out.println(e);
		}finally {
			JdbcUtil.close(con, ps, rs);
		}
		
		
		System.out.println("JDBC TEST END");
	}
}
