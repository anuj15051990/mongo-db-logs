package com.fitchrating.app.document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LogRead {

	@Id
	private String loggerId;
	private String loggerMessage;
	private Date creationDate = new Date();
	private Map<String, String> userSetting = new HashMap<>();

	public String getLoggerId() {
		return loggerId;
	}

	public void setLoggerId(String loggerId) {
		this.loggerId = loggerId;
	}

	public String getLoggerMessage() {
		return loggerMessage;
	}

	public void setLoggerMessage(String loggerMessage) {
		this.loggerMessage = loggerMessage;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Map<String, String> getUserSetting() {
		return userSetting;
	}

	public void setUserSetting(Map<String, String> userSetting) {
		this.userSetting = userSetting;
	}

}