package com.yedam.service;

import java.util.List;
import java.util.Map;

public interface CalendarService {

	//일정
	List<Map<String, Object>> eventList();
	//일정추가
	int addEvent(Map<String, String> addevent);
	
}
