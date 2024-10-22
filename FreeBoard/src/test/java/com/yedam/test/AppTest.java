package com.yedam.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.mapper.ReplyMapper;
import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;
import com.yedam.vo.ReplyVO;

public class AppTest {

	public static void main(String[] args) {
		
		SqlSession sqlSession = DataSource.getInstance().openSession();
		ReplyMapper mapper = sqlSession.getMapper(ReplyMapper.class);
		
//		
//		SearchDTO search = new SearchDTO();
//		search.setPage(1);
//		
//		List<BoardVO> list = mapper.listWithPage(search);
//			for(BoardVO bvo : list) {
//				System.out.println(bvo.toString());
//			}
		ReplyService svc = new ReplyServiceImpl();
		
//		List<ReplyVO> list = mapper.selectList(194);

		List<ReplyVO> list = mapper.selectList(287);
		for(ReplyVO bvo : list) {
			System.out.println(bvo.toString());
		}
		
		ReplyVO reply = new ReplyVO();
//		reply.setReply("댓글테스트");
//		reply.setReplyer("user01");
//		reply.setBoardNo(194);
//		
//		if(mapper.insertReply(reply)==1) {
//			sqlSession.commit();
//		}
		
		reply.setBoardNo(200);	//delete가 안됨
		if(mapper.deleteReply(reply.getBoardNo())==1) {
			sqlSession.commit();
		}
		
	}
	
}
