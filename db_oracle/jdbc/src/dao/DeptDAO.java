package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;
import vo.DeptVO;

public class DeptDAO {
	
	public void insertDept(String dname, String loc) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		String sql = 
		"insert into dept2 (deptno,dname,loc) "+
		"values((select nvl(max(deptno),0)+1 from dept2),?,?)";
		
		try {
			con = JdbcUtil.GetConnection();
			ps = con.prepareStatement(sql);
			// ? 값 세팅 작업
			ps.setString(1, dname);
			ps.setString(2, loc);
			row = ps.executeUpdate(); // DML 구문 처리 함수
			
			// 결과값 처리
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(con, ps, rs);
		}
	}
	
	public void deleteDept(int deptno) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		String sql = 
		"delete from dept2 where deptno = ?";
		
		try {
			con = JdbcUtil.GetConnection();
			ps = con.prepareStatement(sql);
			// ? 값 세팅 작업
			ps.setInt(1, deptno);
			row = ps.executeUpdate(); // DML 구문 처리 함수
			
			// 결과값 처리
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(con, ps, rs);
		}
	}
	
	public List<DeptVO> deptList() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		String sql = "select * from dept";
		
		List<DeptVO> list = new ArrayList<DeptVO>();
		try {
			con = JdbcUtil.GetConnection();
			ps = con.prepareStatement(sql);
			// ? 값 세팅 작업
			rs = ps.executeQuery(); // select 구문 처리 함수
			while(rs.next()) {
				DeptVO vo = new DeptVO(
						rs.getInt("deptno"),
						rs.getString("dname"),
						rs.getString("loc")
						);
				
				list.add(vo);
			}
			// 결과값 처리
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(con, ps, rs);
		}
		
		return list;
	}
}
