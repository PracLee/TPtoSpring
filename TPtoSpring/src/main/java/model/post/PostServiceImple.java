package model.post;

import java.util.ArrayList;

import model.userInfo.UserInfoVO;

public class PostServiceImple implements PostService{

	@Override
	public ArrayList<PostVO> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostVO SelectOne(PostVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean InsertDB(PostVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeleteDB(PostVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateDB(PostVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<PostVO> searchPost(String condition, String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PostVO> SelectCategory(PostVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PostVO> SelectViews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PostVO> SelectCategoryForViews(PostVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ViewsUp(PostVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean LikesUp(PostVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean LikesDown(PostVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<PostVO> SelectMyPost(UserInfoVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PostVO> SelectLikePost(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
