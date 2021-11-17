package model.likeInfo;

import java.util.ArrayList;

public interface LikeInfoService {
	  public ArrayList<LikeInfoVO> SelectAll();

	   // SELECT ONE -> boolean 타입, 있으면 true 아니면 false 반환.
	   public boolean SelectOne(LikeInfoVO vo);
	   
	   // INSERT -> 좋아요 정보 저장 -> plike++ 트랜잭션 처리
	   public boolean InsertDB(LikeInfoVO vo);
	   
	   // DELETE -> 좋아요 취소 -> plike-- 트랜잭션 처리
	   public boolean DeleteDB(LikeInfoVO vo);
}
