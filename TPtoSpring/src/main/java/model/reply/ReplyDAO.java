package model.reply;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {
	@Autowired
	JdbcTemplate jdbc;
	
	// 기본 비즈니스 로직
	private static String sql_SELECT_ALL = "SELECT * FROM reply";
	private static String sql_SELECT_ONE = "SELECT * FROM reply WHERE rnum=?";
	private static String sql_INSERT = "INSERT INTO reply (rnum, rment, rdate, rwriter, r_user, r_post, r_comments) VALUES((SELECT NVL(MAX(rnum),0) + 1 FROM reply), ?, sysdate, ?, ?, ?, ?)";
	private static String sql_DELETE = "DELETE FROM reply WHERE rnum=?";
	private static String sql_UPDATE = "UPDATE reply SET rment=?, rdate=sysdate WHERE rnum=?";

	// 사용자 정의 함수
	private static String sql_likeCntUp = "UPDATE reply SET rlikeCnt=rlikeCnt+1 WHERE rnum=?";
	private static String sql_comCntUp = "UPDATE post SET comCnt=comCnt+1 WHERE pnum=?";
	private static String sql_comCntDown = "UPDATE post SET comCnt=comCnt-1 WHERE pnum=?";
	private static String sql_replyCntUp = "UPDATE comments SET replyCnt=replyCnt+1 WHERE cnum=?";
	private static String sql_replyCntDown = "UPDATE comments SET replyCnt=replyCnt-1 WHERE cnum=?";
	

	public List<ReplyVO> selectAll() {
		// TODO Auto-generated method stub
		return jdbc.query(sql_SELECT_ALL, new ReplyRowMapper());
	}

	public ReplyVO selectOne(ReplyVO vo) {
		// TODO Auto-generated method stub
		return jdbc.queryForObject(sql_SELECT_ONE, new ReplyRowMapper());
	}


	public void insertDB(ReplyVO vo) {
		// TODO Auto-generated method stub
		jdbc.update(sql_INSERT, vo.getRment(), vo.getRwriter(), vo.getR_user(), vo.getR_post(), vo.getR_comments());
	}

	public void deleteDB(ReplyVO vo) {
		// TODO Auto-generated method stub
		jdbc.update(sql_DELETE, vo.getRnum());
	}

	public void updateDB(ReplyVO vo) {
		// TODO Auto-generated method stub
		jdbc.update(sql_UPDATE, vo.getRment(), vo.getRnum());
	}

	public void likeCntUp(ReplyVO vo) {
		// TODO Auto-generated method stub
		jdbc.update(sql_likeCntUp, vo.getRnum());
	}
	
	public void comCntUp(ReplyVO vo) {
		
	}
	
}
class ReplyRowMapper implements RowMapper<ReplyVO>{

	@Override
	public ReplyVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ReplyVO data = new ReplyVO();
		data.setR_comments(rs.getInt("r_comments"));
		data.setR_post(rs.getInt("r_post"));
		data.setR_user(rs.getString("r_user"));
		data.setRdate(rs.getDate("rdate"));
		data.setRlikeCnt(rs.getInt("rlikeCnt"));
		data.setRment(rs.getString("rment"));
		data.setRnum(rs.getInt("rnum"));
		data.setRwriter(rs.getString("rwriter"));
		return data;
	}

}

