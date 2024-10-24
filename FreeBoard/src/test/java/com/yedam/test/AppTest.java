package com.yedam.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.service.CalendarService;
import com.yedam.service.CalendarServiceImpl;
import com.yedam.vo.CalendarVO;

public class AppTest {

	public static void main(String[] args) {
		
		CalendarVO cal = new CalendarVO();
		CalendarService svc = new CalendarServiceImpl();
		List<Map<String, Object>> result = svc.eventList();
		
		String title = "test";
		String startDate = "2024-10-20";
		String endDate = "2024-10-21";
//		cal.setTitle(title);
//		cal.setStartDate(startDate);
//		cal.setEndDate(endDate);
		
		Map<String, String> map = new HashMap<>();
		map.put("title", title);
		map.put("start", startDate);
		map.put("end", endDate);
		
		System.out.println(map);
		
		try {
			if(svc.addEvent(map)==1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(result);
		
		System.out.println(json);

		
	}
	
}
