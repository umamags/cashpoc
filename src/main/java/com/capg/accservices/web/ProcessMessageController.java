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
public class ProcessMessageController {

	@RequestMapping(value="/cashpoc/testApi",method = RequestMethod.GET)
    public String testMessage() {
		System.out.println("Test API is working");
		return "Test API works from CashPOC application";
    }
	
	@RequestMapping(value="/cashpoc/processMessageApi",method = RequestMethod.POST)
    public String processMessage(@RequestBody Object message) {
		System.out.println("Message Processed::" + message);
		return "Message is Processed::" + message;
    }

	@RequestMapping(value="/cashpoc/checkDuplicateMessage",method = RequestMethod.POST)
    public String checkDuplicateMessage(@RequestBody Object message) {
		System.out.println("Check Duplicate Message:" + message);
		return "Duplicate Message::" + message;
    }
	
	@RequestMapping(value="/cashpoc/validateMessage",method = RequestMethod.POST)
    public String validateMessage(@RequestBody Object message) {
		System.out.println("Validate Message:" + message);
		return "Validate message::" + message;
    }
	
	@RequestMapping(value="/cashpoc/transformMessage",method = RequestMethod.POST)
	public String transformMessage(@RequestBody Object message) {
		System.out.println("Transform Message:" + message);
		return "Message Transformed::" + message;
    }
	
	@RequestMapping(value="/cashpoc/transmitMessage",method = RequestMethod.POST)
    public String transmitMessage(@RequestBody Object message) {
		System.out.println("Message Transmitted:" + message);
		return "Message Transmitted::" + message;
    }
	
	@RequestMapping(value="/cashpoc/getLatestStatusOnMessage",method = RequestMethod.GET)
    public String getLatestStatusOnMessage(@RequestBody Object message) {
		System.out.println("get Latest Status on Message:" + message);
		return "Latest Status on Message::" + message;
    }
}