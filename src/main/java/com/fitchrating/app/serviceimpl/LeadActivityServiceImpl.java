package com.fitchrating.app.serviceimpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitchrating.app.document.LeadActivity;
import com.fitchrating.app.repository.LeadActivityRepository;
import com.fitchrating.app.service.LeadActivityService;

@Service
public class LeadActivityServiceImpl implements LeadActivityService {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
	@Autowired
	private LeadActivityRepository leadActivityRepository;

	@Override
	public List<LeadActivity> fetchAllLogs() {
		List<LeadActivity> response = leadActivityRepository
				.findByActivityDateLessThanEqualAndActivityTypeID(LocalDateTime.now().format(formatter), "2");

		return response;
	}

	@Override
	public void save(LeadActivity leadActivity) {

		leadActivityRepository.save(leadActivity);
	}

}
