package com.ibm.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

import com.ibm.model.Cart;
import org.springframework.http.ResponseEntity;


public class AddCartResponseWrapper {

	private Void response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public Void getResponse(){
            return response;
	}
 
	public void setResponse(Void response){
            this.response=response;
	} 
}
