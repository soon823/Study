package com.yedam.service;

import java.util.List;

import com.yedam.vo.ReplyVO;

public interface ReplyService {
	
	List<ReplyVO> replyList(int boardNo, int page);	//목록
	boolean addReply(ReplyVO reply);		//댓글등록
	boolean removeReply(int replyNo);		//댓글삭제
	ReplyVO getReply(int replyNo);			//단건조회
	//댓글카운트
	int replyCount(int boardNo);
	
}
