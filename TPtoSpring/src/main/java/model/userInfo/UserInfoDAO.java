package model.userInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserInfoDAO {
	@Autowired
	JdbcTemplate jdbc;
	//  Basic CRUD form
	private static String sql_SELECT_ALL = "SELECT * FROM userInfo";
	private static String sql_SELECT_ONE = "SELECT * FROM userInfo WHERE id=? AND pw=?";
	private static String sql_INSERT = "INSERT INTO userInfo (id, pw, name) VALUES(?, ?, ?)";
	private static String sql_DELETE = "DELETE FROM userInfo WHERE id=?";
	private static String sql_UPDATE = "UPDATE userInfo SET name=?, pw=? WHERE id=?";

	// Various Functions form
	private static String sql_updateProfile = "UPDATE userinfo SET profile=? WHERE id=?";
	private static String sql_FindInfo = "SELECT * FROM userInfo WHERE id=?";
	
	public List<UserInfoVO> getUserList(){
		return jdbc.query(sql_SELECT_ALL, new UserInfoRowMapper());
	}
	
	public UserInfoVO login(UserInfoVO vo) {
		return jdbc.queryForObject(sql_SELECT_ONE, new UserInfoRowMapper());
	}
	
	public void joinUs(UserInfoVO vo) {
		jdbc.update(sql_INSERT, vo.getId(),vo.getPw(),vo.getName());
	}
	
	public void deleteUser(UserInfoVO vo) {
		jdbc.update(sql_DELETE, vo.getId());
	}
	
	public void updateUser(UserInfoVO vo) {
		jdbc.update(sql_UPDATE,vo.getName(),vo.getPw(),vo.getId());
	}
	
	public UserInfoVO findUser(UserInfo vo) {
		
	}
}
