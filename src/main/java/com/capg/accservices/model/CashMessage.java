package com.capg.accservices.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Configuration
@Component
@XmlRootElement
public class CashMessage {
	@JsonProperty("messageId")
	private String messageId;
	
	@JsonProperty("name")
	private String name;
	
	public CashMessage() {
		super();
	}

	public CashMessage(String messageId, String name) {
		super();
		this.messageId = messageId;
		this.name = name;
	}
	
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
