package com.yedam.test;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;

public class AppTest {

	public static void main(String[] args) {
		
		BoardService svc = new BoardServiceImpl();
		List<Map<String, Object>> result = svc.countByWriter();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(result);
		
		System.out.println(json);

		
	}
	
}
