package com.capg.accservices.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.accservices.model.Account;
import com.capg.accservices.model.Transaction;
import com.capg.accservices.paymentValidationXmlbeans.ValidatePaymentDetailsReq;
import com.capg.accservices.returnXmlbeans.Return;
import com.capg.accservices.service.AccountService;

/***
 * Account services related API controller
 * 
 * @author sujillel
 *
 */

@RestController
@ComponentScan("com.capg.accservices")
@CrossOrigin
@EnableAutoConfiguration
public class AccountServicesController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/accservices/processMessage", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE } , produces = { MediaType.APPLICATION_XML_VALUE})
	public Return processMessageApi(@RequestBody ValidatePaymentDetailsReq message) {
		System.out.println("Message Processed::" + message.toString());
		return accountService.isMessageIdExist(message);
	}

}