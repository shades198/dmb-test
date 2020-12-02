package com.ibm.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import java.util.List;
import com.ibm.model.Cart;


public class GetCustomerByIdResponseWrapper {

	private List<Cart> response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public List<Cart> getResponse(){
            return response;
	}
 
	public void setResponse(List<Cart> response){
            this.response=response;
	} 
}
