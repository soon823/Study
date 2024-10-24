package com.yedam.service;

import java.util.List;
import java.util.Map;

import com.yedam.common.SearchDTO;
import com.yedam.vo.BoardVO;

public interface BoardService {

	// 목록 변경 ,등록 ,삭제 ,단건조회
	List<BoardVO> boardList(SearchDTO search);
	boolean registerBoard(BoardVO board);
	boolean removeBoard(int boardNo);
	boolean modifyBoard(BoardVO board);
	BoardVO searchBoard(int boardNo);
	
	//페이징 카운트
	int getTotalCount(SearchDTO search);
	//사용자별 게시글
	List<Map<String, Object>> countByWriter();
	
}
