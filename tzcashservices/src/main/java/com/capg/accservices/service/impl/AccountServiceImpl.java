package com.capg.accservices.service.impl;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.capg.accservices.dao.MessageDAO;
import com.capg.accservices.paymentValidationXmlbeans.ValidatePaymentDetailsReq;
import com.capg.accservices.returnXmlbeans.Return;
import com.capg.accservices.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService{
	static Logger logger = Logger.getLogger(AccountServiceImpl.class);
	
	@Autowired
	private MessageDAO messagesDAO;
	
	@Autowired
	private KafkaClient kafkaClient;
	
	@Value("${max.recent.transactions}")
	private Integer maxRecentTransactions;
	
	@Override
	public Return isMessageIdExist(ValidatePaymentDetailsReq req) {
		JAXBContext jaxbContext;
		StringWriter sw = new StringWriter();
		try {
			jaxbContext = JAXBContext.newInstance(ValidatePaymentDetailsReq.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        marshaller.marshal(req, sw);
	        String request = sw.toString();
	        kafkaClient.postKafkaMessage(request);
		} catch (JAXBException e) {
			logger.error(e);
		}
        
		
		boolean found = !messagesDAO.findByMd(req.getPayloadHeader().getMessageId()).isEmpty();
		if(found) {
			Return ret = new Return();
			ret.setErrorcode("404");
			ret.setErrorMessage("Message is a duplicate");
			return ret;
		}
		else
		{
			return populateReturn();
		}
	}

	private Return populateReturn() {
		Return ret = new Return("100","SCBUS33XXX","GCGPVResponse12345","15186118", "TZD","1233", "","","1804509","1","1","PayerName","tin1223","1234567890");
		return ret;
	}
}