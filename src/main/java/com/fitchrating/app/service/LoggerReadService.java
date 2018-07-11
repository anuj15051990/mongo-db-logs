package com.fitchrating.app.service;

import java.util.List;

import com.fitchrating.app.document.LogRead;

public interface LoggerReadService {
  
	public List<LogRead> findAll();
	
	public List<LogRead> findByCreatedDate();
	
	public List<LogRead> findByCreatedDateAndBetweenModifiedDate();
	
	
	
}
