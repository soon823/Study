package com.yedam.control.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.yedam.common.Control;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;
import com.yedam.vo.BoardVO;

public class AddBoardControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 파라미터값에 한글이 포함되어있으면 사용
		req.setCharacterEncoding("utf-8");
		String savePath = req.getServletContext().getRealPath("images");
		int maxSize = 1023 * 1025 * 5;
		
		//Multipart요청에 대한 처리로 변경
		MultipartRequest mr = new MultipartRequest(//
				req	//1.요청정보
				,savePath	//2.저장경로
				,maxSize	//3.최대크기
				,"utf-8"	//4encoding 방식
				,new DefaultFileRenamePolicy()	//리네임정책
				);
		
		// title ,content ,writer 3개 파라미터 db 등록 -> 목록보여주기
		// key=value&key=value text 처리 
		String title = mr.getParameter("title"); 
		String content = mr.getParameter("content"); 
		String writer = mr.getParameter("writer"); 
		String img = mr.getFilesystemName("img");
		
		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(writer);
		board.setImg(img);
		
		BoardService svc = new BoardServiceImpl();
		try {		
			// 정상등록 -> 글목록 페이지로 이동
			svc.registerBoard(board);
			resp.sendRedirect("boardList.do");
		}catch (Exception e) {
			// 예외가발생하면 -> 글등록 페이지로 이동
			req.setAttribute("msg", "등록하는중에 오류가 발생했습니다");
			req.getRequestDispatcher("WEB-INF/jsp/boardForm.jsp").forward(req, resp);
		}
		
	}

}
