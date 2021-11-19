package model.reply;

import java.util.ArrayList;

public interface ReplyService {
	public ArrayList<ReplyVO> SelectAll();

	// SELECT ONE 
	public ReplyVO SelectOne(ReplyVO vo);

	// INSERT -> ��� DB ��� --> POST ���̺� ��� �� ++ Ʈ�����ó��
	public void InsertDB(ReplyVO vo);

	// DELETE -> ��� ���� --> POST ��� �� --, Comments ��� �� -- Ʈ����� ó��
	public void DeleteDB(ReplyVO vo);

	// UPDATE -> ��� rment ����
	public void UpdateDB(ReplyVO vo);
	
	// ���ƿ� ++
	public void likeCntUp(ReplyVO vo);
}
