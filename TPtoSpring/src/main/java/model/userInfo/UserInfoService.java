package model.userInfo;

import java.util.List;

public interface UserInfoService {
	public List<UserInfoVO> SelectAll();

	// SELECT ONE
	public UserInfoVO SelectOne(UserInfoVO vo);

	// INSERT 
	public void InsertDB(UserInfoVO vo);

	// DELETE
	public void DeleteDB(UserInfoVO vo);

	// UPDATE
	public void UpdateDB(UserInfoVO vo);


	// Method for find user ID and PW.
	public UserInfoVO Find(UserInfoVO vo);


	public void UpdateProfile(UserInfoVO vo);
	// Method for find user's overlapped ID.
	public void CheckID(String id) ;
}
