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
	private UserInfoDAO dao;

	
	@Override
	public List<UserInfoVO> SelectAll() {
		// TODO Auto-generated method stub
		return dao.getUserList();
	}

	@Override
	public UserInfoVO SelectOne(UserInfoVO vo) {
		// TODO Auto-generated method stub
		return dao.login();
	}

	@Override
	public void InsertDB(UserInfoVO vo) {
		// TODO Auto-generated method stub
		dao.joinUs(vo);
	}

	@Override
	public void DeleteDB(UserInfoVO vo) {
		// TODO Auto-generated method stub
		dao.deleteUser(vo);
	}

	@Override
	public void UpdateDB(UserInfoVO vo) {
		// TODO Auto-generated method stub
		dao.updateUser(vo);
	}

	@Override
	public UserInfoVO Find(UserInfoVO vo) {
		// TODO Auto-generated method stub
		return jdbc.queryForObject(sql_FindInfo, new UserInfoRowMapper());
	}

	@Override
	public void UpdateProfile(UserInfoVO vo) {
		// TODO Auto-generated method stub
		jdbc.update(sql_updateProfile, vo.getProfile(), vo.getId());
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
