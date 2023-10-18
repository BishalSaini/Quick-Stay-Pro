package com.jsp.service;

import com.jsp.dao.HistoryDao;
import com.jsp.dto.History;

public class HistoryService { 
	
	HistoryDao historyDao=new HistoryDao();  
	History history=new History(); 
	
	public History saveHistory(History history) {
		return historyDao.saveHistory(history);
		
	}
	
}