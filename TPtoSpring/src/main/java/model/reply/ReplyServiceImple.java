package model.reply;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class ReplyServiceImple implements ReplyService{

	@Autowired
	ReplyDAO dao;
	
	@Override
	public ArrayList<ReplyVO> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReplyVO SelectOne(ReplyVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void InsertDB(ReplyVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteDB(ReplyVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDB(ReplyVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void likeCntUp(ReplyVO vo) {
		// TODO Auto-generated method stub
		
	}


}
