package model.reply;

import java.util.ArrayList;

public interface ReplyService {
	public ArrayList<ReplyVO> SelectAll();

	// SELECT ONE 
	public ReplyVO SelectOne(ReplyVO vo);

	// INSERT -> 답글 DB 등록 --> POST 테이블 댓글 수 ++ 트랜잭션처리
	public boolean InsertDB(ReplyVO vo);

	// DELETE -> 답글 삭제 --> POST 댓글 수 --, Comments 답글 수 -- 트랜잭션 처리
	public boolean DeleteDB(ReplyVO vo);

	// UPDATE -> 답글 rment 수정
	public boolean UpdateDB(ReplyVO vo);
	
	// 좋아요 ++
	public boolean likeCntUp(ReplyVO vo);
}
