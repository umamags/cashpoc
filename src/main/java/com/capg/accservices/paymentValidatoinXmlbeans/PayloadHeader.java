/**
 * 
 */
package com.capg.accservices.paymentValidatoinXmlbeans;

/**
 * @author bvembu
 *
 */
public class PayloadHeader {
	String captureSystem;
	String subPaymentType;
	String countryCode;
	String messageId;

	public String getCaptureSystem() {
		return captureSystem;
	}

	public void setCaptureSystem(String captureSystem) {
		this.captureSystem = captureSystem;
	}

	public String getSubPaymentType() {
		return subPaymentType;
	}

	public void setSubPaymentType(String subPaymentType) {
		this.subPaymentType = subPaymentType;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@Override
	public String toString() {
		return "PayloadHeader [captureSystem=" + captureSystem + ", subPaymentType=" + subPaymentType + ", countryCode="
				+ countryCode + ", messageId=" + messageId + "]";
	}
}
