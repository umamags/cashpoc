package com.capg.accservices.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/***
 * Cash Poc services related API controller
 *
 */

@RestController
@ComponentScan("com.capg.accservices")
@CrossOrigin
@EnableAutoConfiguration
public class CashPocController {

	@RequestMapping(value="/cashpoc/processMessageApi",method = RequestMethod.GET)
    public String processMessage() {
		System.out.println("Message Processed");
		return "Message is Processed";
    }
	
	@RequestMapping(value="/cashpoc/processMessageApi2",method = RequestMethod.POST)
    public String processMessage(@RequestBody Object message) {
		System.out.println("Message Processed::" + message);
		return "Message is Processed::" + message;
    }
	
}