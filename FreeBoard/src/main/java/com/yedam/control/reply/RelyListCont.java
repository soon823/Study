package com.yedam.control.reply;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.common.Control;
import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;
import com.yedam.vo.ReplyVO;

public class RelyListCont implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 게시글번호(bno)
		resp.setContentType("text/json;charset=utf-8");
		
		String bno = req.getParameter("bno");
		
		ReplyService svc = new ReplyServiceImpl();
		List<ReplyVO> list = svc.replyList(Integer.parseInt(bno));
		
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(list);	//자바객체 -> json문자열 변경

		resp.getWriter().print(json);
		
		
	}

}
