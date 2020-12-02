package com.ibm.services.impl;
 
import java.util.*;
 
import com.ibm.model.AddCartP;
import com.ibm.model.AddCartResponseWrapper;
import com.ibm.services.AddCartI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class AddCartImpl implements AddCartI {
 
    private static final Log logger = LogFactory.getLog(AddCartImpl.class);
   
    public AddCartResponseWrapper reliable(AddCartP pojo, Throwable exception){ 
        //TODO
        logger.info("Reliable method triggered with exception : "+exception.getMessage());
        return new AddCartResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable" , commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")})
	public AddCartResponseWrapper execute(AddCartP requestParams){
        //TODO
        return new AddCartResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
