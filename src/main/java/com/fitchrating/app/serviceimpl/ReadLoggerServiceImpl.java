package com.fitchrating.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitchrating.app.document.LogRead;
import com.fitchrating.app.repository.LoggerReadRepository;
import com.fitchrating.app.service.LoggerReadService;

@Service
public class ReadLoggerServiceImpl implements LoggerReadService{

  @Autowired	
  private LoggerReadRepository loggerReadRepository;
	
	
	@Override
	public List<LogRead> findAll() {
		return loggerReadRepository.findAll();
	}

	@Override
	public List<LogRead> findByCreatedDate() {
		return null;
	}

	@Override
	public List<LogRead> findByCreatedDateAndBetweenModifiedDate() {
		return null;
	}

	
}
