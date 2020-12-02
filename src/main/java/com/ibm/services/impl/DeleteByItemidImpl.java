package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.DeleteByItemidP;
import com.ibm.model.DeleteByItemidResponseWrapper;
import com.ibm.services.DeleteByItemidI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class DeleteByItemidImpl implements DeleteByItemidI {
 
    private static final Log logger = LogFactory.getLog(DeleteByItemidImpl.class);
   
    public DeleteByItemidResponseWrapper reliable(DeleteByItemidP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new DeleteByItemidResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public DeleteByItemidResponseWrapper execute(DeleteByItemidP requestParams){
        //TODO
        return new DeleteByItemidResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
