package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.DeleteCartBycustomerIdP;
import com.ibm.model.DeleteCartBycustomerIdResponseWrapper;
import com.ibm.services.DeleteCartBycustomerIdI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class DeleteCartBycustomerIdImpl implements DeleteCartBycustomerIdI {
 
    private static final Log logger = LogFactory.getLog(DeleteCartBycustomerIdImpl.class);
   
    public DeleteCartBycustomerIdResponseWrapper reliable(DeleteCartBycustomerIdP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new DeleteCartBycustomerIdResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public DeleteCartBycustomerIdResponseWrapper execute(DeleteCartBycustomerIdP requestParams){
        //TODO
        return new DeleteCartBycustomerIdResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
