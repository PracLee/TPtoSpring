package model.userInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class UserInfoServiceImple implements UserInfoService{
	
	@Autowired
	private JdbcTemplate jdbc;
	
	//  Basic CRUD form
	private static String sql_SELECT_ALL = "SELECT * FROM userInfo";
	private static String sql_SELECT_ONE = "SELECT * FROM userInfo WHERE id=? AND pw=?";
	private static String sql_INSERT = "INSERT INTO userInfo (id, pw, name) VALUES(?, ?, ?)";
	private static String sql_DELETE = "DELETE FROM userInfo WHERE id=?";
	private static String sql_UPDATE = "UPDATE userInfo SET name=?, pw=? WHERE id=?";

	// Various Functions form
	private static String sql_updateProfile = "UPDATE userinfo SET profile=? WHERE id=?";
	private static String sql_FindInfo = "SELECT * FROM userInfo WHERE id=?";
	@Override
	public List<UserInfoVO> SelectAll() {
		// TODO Auto-generated method stub
		return jdbc.query(sql_SELECT_ALL, new UserInfoRowMapper());
	}

	@Override
	public UserInfoVO SelectOne(UserInfoVO vo) {
		// TODO Auto-generated method stub
		return jdbc.queryForObject(sql_SELECT_ONE, new UserInfoRowMapper());
	}

	@Override
	public void InsertDB(UserInfoVO vo) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void DeleteDB(UserInfoVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDB(UserInfoVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserInfoVO Find(UserInfoVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateProfile(UserInfoVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void CheckID(String id) {
		// TODO Auto-generated method stub
		
	}

}

class UserInfoRowMapper implements RowMapper<UserInfoVO>{

	@Override
	public UserInfoVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserInfoVO data = new UserInfoVO();
		data.setId(rs.getString("id"));
		data.setName(rs.getString("name"));
		data.setProfile(rs.getString("profile"));
		data.setPw(rs.getString("pw"));
		return data;
	}

}
