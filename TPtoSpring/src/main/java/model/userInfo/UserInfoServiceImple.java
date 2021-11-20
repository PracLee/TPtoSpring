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
		return dao.findUser(vo);
	}

	@Override
	public void UpdateProfile(UserInfoVO vo) {
		// TODO Auto-generated method stub
		dao.updateUser(vo);
	}

	@Override
	public void CheckID(String id) {
		// TODO Auto-generated method stub
		
	}

}


