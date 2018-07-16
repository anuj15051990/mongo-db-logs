package com.fitchrating.app.service;

import java.util.List;

import com.fitchrating.app.document.LeadActivity;

public interface LeadActivityService {
 
	List<LeadActivity> fetchAllLogs();
	public void save(LeadActivity leadActivity);
	
}
