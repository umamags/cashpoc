package com.capg.accservices.service;

import org.springframework.stereotype.Service;

import com.capg.accservices.paymentValidationXmlbeans.ValidatePaymentDetailsReq;
import com.capg.accservices.returnXmlbeans.Return;

@Service
public interface AccountService {

	public Return isMessageIdExist(ValidatePaymentDetailsReq req);
}
