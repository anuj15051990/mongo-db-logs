package com.fitchrating.app.document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "LeadActivity")
public class LeadActivity {

	@Id
	private String _id;
	private String requestTypeId;
	private String leadID;
	private String munchldnID;
	private String url;
	private String activityTypeID;
	private String activityTypeName;
	private String sourceID;
	private String source;
	private String ipAddress;
	private String userType;
	private String requestTypeName;
	private String requestCannoicalID;
	@Field
	private String addToMongoDate;
	@Field
	private String activityDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getRequestTypeId() {
		return requestTypeId;
	}

	public void setRequestTypeId(String requestTypeId) {
		this.requestTypeId = requestTypeId;
	}

	public String getLeadID() {
		return leadID;
	}

	public void setLeadID(String leadID) {
		this.leadID = leadID;
	}

	public String getMunchldnID() {
		return munchldnID;
	}

	public void setMunchldnID(String munchldnID) {
		this.munchldnID = munchldnID;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getActivityTypeID() {
		return activityTypeID;
	}

	public void setActivityTypeID(String activityTypeID) {
		this.activityTypeID = activityTypeID;
	}

	public String getActivityTypeName() {
		return activityTypeName;
	}

	public void setActivityTypeName(String activityTypeName) {
		this.activityTypeName = activityTypeName;
	}

	public String getSourceID() {
		return sourceID;
	}

	public void setSourceID(String sourceID) {
		this.sourceID = sourceID;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRequestTypeName() {
		return requestTypeName;
	}

	public void setRequestTypeName(String requestTypeName) {
		this.requestTypeName = requestTypeName;
	}

	public String getRequestCannoicalID() {
		return requestCannoicalID;
	}

	public void setRequestCannoicalID(String requestCannoicalID) {
		this.requestCannoicalID = requestCannoicalID;
	}

	public String getAddToMongoDate() {
		return addToMongoDate;
	}

	public void setAddToMongoDate(String addToMongoDate) {
		this.addToMongoDate = addToMongoDate;
	}

	public String getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}

}
