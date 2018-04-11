/**
 * 
 */
package com.capg.accservices.kafka.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author bvembu
 *
 */
@RestController
@EnableAutoConfiguration
public class KafkaController {

	@RequestMapping(value = "/kafka/processMessage", method = RequestMethod.POST)
	public boolean processMessageApi(@RequestBody String message) {
		System.out.println("Got message "+message);
		return true;
	}
}
