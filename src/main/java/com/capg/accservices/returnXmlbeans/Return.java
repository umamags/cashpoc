/**
 * 
 */
package com.capg.accservices.returnXmlbeans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author bvembu
 *
 */
@XmlRootElement
public class Return {
	public Return() {
		super();
	}

	public Return(String amount, String bankCode, String bankReference, String controlNo, String currency,
			String deptCode, String errorcode, String errorMessage, String receiptNo, String responseCode,
			String serviceCode, String taxPayerName, String tin, String traAccountNo) {
		super();
		this.amount = amount;
		this.bankCode = bankCode;
		this.bankReference = bankReference;
		this.controlNo = controlNo;
		this.currency = currency;
		this.deptCode = deptCode;
		this.errorcode = errorcode;
		this.errorMessage = errorMessage;
		this.receiptNo = receiptNo;
		this.responseCode = responseCode;
		this.serviceCode = serviceCode;
		this.taxPayerName = taxPayerName;
		this.tin = tin;
		this.traAccountNo = traAccountNo;
	}

	String amount;
	String bankCode;
	String bankReference;
	String controlNo;
	String currency;
	String deptCode;
	String errorcode;
	String errorMessage;
	String receiptNo;
	String responseCode;
	String serviceCode;
	String taxPayerName;
	String tin;
	String traAccountNo;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankReference() {
		return bankReference;
	}

	public void setBankReference(String bankReference) {
		this.bankReference = bankReference;
	}

	public String getControlNo() {
		return controlNo;
	}

	public void setControlNo(String controlNo) {
		this.controlNo = controlNo;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getTaxPayerName() {
		return taxPayerName;
	}

	public void setTaxPayerName(String taxPayerName) {
		this.taxPayerName = taxPayerName;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getTraAccountNo() {
		return traAccountNo;
	}

	public void setTraAccountNo(String traAccountNo) {
		this.traAccountNo = traAccountNo;
	}
}
