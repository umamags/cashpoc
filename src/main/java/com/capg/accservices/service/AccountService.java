package com.capg.accservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.accservices.model.Account;
import com.capg.accservices.model.Customer;
import com.capg.accservices.model.Transaction;
import com.capg.accservices.paymentValidationXmlbeans.ValidatePaymentDetailsReq;
import com.capg.accservices.returnXmlbeans.Return;

@Service
public interface AccountService {

	public Return isMessageIdExist(ValidatePaymentDetailsReq req);
}
