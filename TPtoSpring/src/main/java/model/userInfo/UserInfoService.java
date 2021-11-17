package model.userInfo;

import java.util.ArrayList;

public interface UserInfoService {
	public ArrayList<UserInfoVO> SelectAll();

	// SELECT ONE
	public UserInfoVO SelectOne(UserInfoVO vo);

	// INSERT 
	public boolean InsertDB(UserInfoVO vo);

	// DELETE
	public boolean DeleteDB(UserInfoVO vo);

	// UPDATE
	public boolean UpdateDB(UserInfoVO vo);


	// Method for find user ID and PW.
	public UserInfoVO Find(UserInfoVO vo);


	public boolean UpdateProfile(UserInfoVO vo);
	// Method for find user's overlapped ID.
	public boolean CheckID(String id) ;
}
