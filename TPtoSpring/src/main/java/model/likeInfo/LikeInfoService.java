package model.likeInfo;

import java.util.ArrayList;

public interface LikeInfoService {
	  public ArrayList<LikeInfoVO> SelectAll();

	   // SELECT ONE -> boolean Ÿ��, ������ true �ƴϸ� false ��ȯ.
	   public boolean SelectOne(LikeInfoVO vo);
	   
	   // INSERT -> ���ƿ� ���� ���� -> plike++ Ʈ����� ó��
	   public boolean InsertDB(LikeInfoVO vo);
	   
	   // DELETE -> ���ƿ� ��� -> plike-- Ʈ����� ó��
	   public boolean DeleteDB(LikeInfoVO vo);
}
