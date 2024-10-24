package com.yedam.control.calendar;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.common.Control;
import com.yedam.service.CalendarService;
import com.yedam.service.CalendarServiceImpl;

public class AddEventCont implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/json;charset=UTF-8");
		
		CalendarService svc = new CalendarServiceImpl();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Map<String, String> map = new HashMap<>();
		
		String title = req.getParameter("title");
		String startDate = req.getParameter("start");
		String endDate = req.getParameter("end");
		
		
		map.put("title", title);
		map.put("start", startDate);
		map.put("end", endDate);
		
		String json = gson.toJson(map);
		
		try {
			if(svc.addEvent(map)==1) {
				json = "{\"retCode\": \"OK\"}";
		      
		        resp.getWriter().print(json);
		        
			}else {
				json = "{\"retCode\": \"FAIL\"}";
				
				resp.getWriter().print(json);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
