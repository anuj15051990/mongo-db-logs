package com.fitchrating.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fitchrating.app.document.LeadActivity;

@Repository
public interface LeadActivityRepository extends MongoRepository<LeadActivity, String> {
 
	List<LeadActivity> findByActivityDateLessThanEqualAndActivityTypeID(String activityDate , String activityTypeID);
	List<LeadActivity> findByActivityTypeID(String activityTypeID);
	
	
	
}
