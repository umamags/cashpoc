package com.capg.accservices.service.impl;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capg.accservices.service.impl.KafkaClient.HystrixClientFallBack;

@FeignClient(name = "KAFKA-SERVICE", fallback= HystrixClientFallBack.class)
public interface KafkaClient {

    @RequestMapping(method = RequestMethod.POST, value = "/kafka/processMessage")
    boolean postKafkaMessage(@RequestBody String message);
    
    @Component
    static class HystrixClientFallBack implements KafkaClient{

		@Override
		public boolean postKafkaMessage(String message) {
			System.out.println("Fallback Method used");
			return false;
		}
    	
    }
}
