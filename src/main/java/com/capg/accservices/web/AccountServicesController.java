package com.capg.accservices.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
	private static final Logger LOGGER =
		      LoggerFactory.getLogger(AccountServicesController.class);


	@RequestMapping(value = "/accservices/processMessage", method = RequestMethod.POST, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE } , produces = { MediaType.APPLICATION_XML_VALUE})
	public Return processMessageApi(@RequestBody ValidatePaymentDetailsReq message) {
		LOGGER.info("Message Processed::" + message.toString());
		return accountService.isMessageIdExist(message);
	}
}