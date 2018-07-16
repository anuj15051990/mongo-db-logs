package com.fitchrating.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitchrating.app.document.LeadActivity;
import com.fitchrating.app.service.LeadActivityService;

@RestController
@RequestMapping(value = "/logs")
public class LeadActivityController {

	
	@Autowired
	private LeadActivityService leadActivityService;
	
	 @GetMapping("/allLogs")
	    public ResponseEntity<List<LeadActivity>> getLogs() {
		 
		 return new ResponseEntity<>(leadActivityService.fetchAllLogs(), HttpStatus.OK);
	    }
	
	    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<?> saveMessage(@RequestBody LeadActivity leadActivity) {

		        leadActivityService.save(leadActivity);
	            return new ResponseEntity<>(null, HttpStatus.OK);
	       
	    }

	 
}
