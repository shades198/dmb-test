package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.GetCustomerByIdP;
import com.ibm.model.GetCustomerByIdResponseWrapper;
import com.ibm.services.GetCustomerByIdI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class GetCustomerByIdImpl implements GetCustomerByIdI {
 
    private static final Log logger = LogFactory.getLog(GetCustomerByIdImpl.class);
   
    public GetCustomerByIdResponseWrapper reliable(GetCustomerByIdP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new GetCustomerByIdResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public GetCustomerByIdResponseWrapper execute(GetCustomerByIdP requestParams){
        //TODO
        return new GetCustomerByIdResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
