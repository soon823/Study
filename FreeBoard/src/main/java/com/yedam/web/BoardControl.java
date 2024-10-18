package com.yedam.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;
import com.yedam.vo.BoardVO;

public class BoardControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// board.do -> 상세조회(bno) -> 조회 -> board.jsp출력
		String bno = req.getParameter("bno");
		String page = req.getParameter("page");

		
		BoardService svc = new BoardServiceImpl();
		BoardVO board = svc.searchBoard(Integer.parseInt(bno));
		
		req.setAttribute("boardvo", board);
		req.setAttribute("page", page);
		
		req.getRequestDispatcher("WEB-INF/jsp/board.jsp").forward(req, resp);;
		
	}

}
