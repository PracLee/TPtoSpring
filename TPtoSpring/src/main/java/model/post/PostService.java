package model.post;

import java.util.ArrayList;

import model.userInfo.UserInfoVO;

public interface PostService {
	public ArrayList<PostVO> SelectAll();

	// 
	public PostVO SelectOne(PostVO vo);
	
	// InsertPost
	public boolean InsertDB(PostVO vo);
	
	// DeletePost
	public boolean DeleteDB(PostVO vo);

	// EditPost
	public boolean UpdateDB(PostVO vo);
	
	//Condition
	public ArrayList<PostVO> searchPost(String condition,String text);
	
	
	// 
    public ArrayList<PostVO> SelectCategory(PostVO vo);
    
    // 
    public ArrayList<PostVO> SelectViews();
    
    public ArrayList<PostVO> SelectCategoryForViews(PostVO vo);
    
 
 	public boolean ViewsUp(PostVO vo);

 	public boolean LikesUp(PostVO vo);
 
 	public boolean LikesDown(PostVO vo);
 	
 	public ArrayList<PostVO> SelectMyPost(UserInfoVO vo);
 	
 	public ArrayList<PostVO> SelectLikePost(String id);
}
