package model.reply;

import java.util.ArrayList;

public interface ReplyService {
	public ArrayList<ReplyVO> SelectAll();

	// SELECT ONE 
	public ReplyVO SelectOne(ReplyVO vo);

	// INSERT -> ��� DB ��� --> POST ���̺� ��� �� ++ Ʈ�����ó��
	public boolean InsertDB(ReplyVO vo);

	// DELETE -> ��� ���� --> POST ��� �� --, Comments ��� �� -- Ʈ����� ó��
	public boolean DeleteDB(ReplyVO vo);

	// UPDATE -> ��� rment ����
	public boolean UpdateDB(ReplyVO vo);
	
	// ���ƿ� ++
	public boolean likeCntUp(ReplyVO vo);
}
