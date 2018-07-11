package com.fitchrating.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitchrating.app.document.LogRead;
import com.fitchrating.app.service.LoggerReadService;

@RestController
@RequestMapping(value = "/")
public class ReadLoggerController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private LoggerReadService loggerReadService;

	@GetMapping(value = "/getLogs")
	public ResponseEntity<List<LogRead>> getAllLogs() {
		
		LOG.info("Calling getAllLogs() for fetching logs");
		
		List<LogRead> response = loggerReadService.findAll();

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
