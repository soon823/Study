package com.yedam.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

//@WebServlet("*.do")
public class FrontController extends HttpServlet{
	
	Map<String ,Control> map;
	
	public FrontController() {
		//System.out.println("객체생성");
		map = new HashMap<>();
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		//System.out.println("init호출");
		map.put("/memberList.do", new MemberListControl());
		// 회원등록 1)등록화면 2)등록처리
		map.put("/memberAddForm.do", new MemberAddFormControl());
		map.put("/memberAdd.do", new MemberAddControl());
		
		
		// 게시판 관련
		map.put("/boardList.do", new BoardListControl());
		// 게시글 상세화면
		map.put("/board.do", new BoardControl());
		// 글등록 (등록화면 -> 등록처리)
		map.put("/addBoardForm.do", new AddBoardForm());
		map.put("/addBoard.do", new AddBoardControl());
		// 글수정 (수정화면 -> 변경처리)
		map.put("/modifyBoard.do", new ModifyBoardControl());
		// 글삭제 
		map.put("/removeBoard.do", new RemoveBoardControl());
		// 로그인
		map.put("/loginForm.do", new LoginControl());
		map.put("/logOut.do", new LogOutControl());
		//자바스크립트
		map.put("/javascript.do", new JavaScriptCont());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("service호출");
		// 요청페이지?
		// url 전체 = http://localhost/FreeBoard/add.do
		String uri = req.getRequestURI();	// uri = /FreeBoard/add.do
		String context = req.getContextPath();	// context = /FreeBoard
		String page = uri.substring(context.length());	// page = /add.do
		
		Control control = map.get(page);
		control.exec(req, resp);
		
	}
	
}
