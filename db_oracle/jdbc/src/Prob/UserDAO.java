package Prob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	public UserVO login(String id, String pw) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from users where id=? and pw=?";
		
		UserVO uservo = new UserVO();
		try {
			con = JDBCUtil.GetConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			
			rs.next();
			uservo.setId(rs.getString("id"));
			uservo.setPw(rs.getString("pw"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
		return uservo;
	}
}
