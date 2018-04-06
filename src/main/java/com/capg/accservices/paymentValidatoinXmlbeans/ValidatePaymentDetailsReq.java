package com.capg.accservices.paymentValidatoinXmlbeans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author bvembu
 *
 */
@XmlRootElement
public class ValidatePaymentDetailsReq {

	public ValidatePaymentDetailsReq(PayloadHeader payloadHeader, int registrationNumber, Date registrationDate,
			String bankCode, int sourceID, Date timestamp, String currency, String transactionNumber, String typeName,
			int taxAmount) {
		super();
		this.payloadHeader = payloadHeader;
		this.registrationNumber = registrationNumber;
		this.registrationDate = registrationDate;
		this.bankCode = bankCode;
		this.sourceID = sourceID;
		this.timestamp = timestamp;
		this.currency = currency;
		this.transactionNumber = transactionNumber;
		this.typeName = typeName;
		this.taxAmount = taxAmount;
	}

	public ValidatePaymentDetailsReq() {
		super();
	}
	
	PayloadHeader payloadHeader;
	

	public PayloadHeader getPayloadHeader() {
		return payloadHeader;
	}

	public void setPayloadHeader(PayloadHeader payloadHeader) {
		this.payloadHeader = payloadHeader;
	}

	int registrationNumber;

	Date registrationDate;

	String bankCode;

	int sourceID;

	Date timestamp;

	String currency;

	String transactionNumber;

	String typeName;

	int taxAmount;

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public int getSourceID() {
		return sourceID;
	}

	public void setSourceID(int sourceID) {
		this.sourceID = sourceID;
	}

	// @XmlElement(name = "pymtValdn:timestamp")
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}

	@Override
	public String toString() {
		return "ValidatePaymentDetailsReq [payloadHeader=" + payloadHeader + ", registrationNumber="
				+ registrationNumber + ", registrationDate=" + registrationDate + ", bankCode=" + bankCode
				+ ", sourceID=" + sourceID + ", timestamp=" + timestamp + ", currency=" + currency
				+ ", transactionNumber=" + transactionNumber + ", typeName=" + typeName + ", taxAmount=" + taxAmount
				+ "]";
	}

}