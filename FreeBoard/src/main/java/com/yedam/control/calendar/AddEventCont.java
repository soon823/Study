package com.yedam.control.calendar;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.CalendarService;
import com.yedam.service.CalendarServiceImpl;

public class AddEventCont implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/json;charset=UTF-8");
		
		CalendarService svc = new CalendarServiceImpl();
		
		String title = req.getParameter("title");
		String startDate = req.getParameter("start");
		String endDate = req.getParameter("end");
		String json;
		
		Map<String, String> map = new HashMap<>();
		map.put("title", title);
		map.put("start", startDate);
		map.put("end", endDate);
		
		try {
			if(svc.addEvent(map)==1) {
				json = "{\"retCode\": \"OK\"}";
			}else {
				json = "{\"retCode\": \"FAIL\"}";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
