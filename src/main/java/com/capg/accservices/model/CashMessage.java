package com.capg.accservices.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Configuration
@Component
public class CashMessage {
	@JsonProperty("messageId")
	private String messageId;
	
	@JsonProperty("name")
	private String name;
	
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return ("messageId=" + messageId + "name=" + name);
	}
}
