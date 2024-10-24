package com.yedam.mapper;

import java.util.List;
import java.util.Map;

public interface CalendarMapper {
	
	//일정
	List<Map<String, Object>> eventList();
	//일정추가
	int insertEvent(Map<String, String> insertevent);

}
