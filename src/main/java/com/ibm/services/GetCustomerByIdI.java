package com.ibm.services;

import com.ibm.model.GetCustomerByIdP;
import com.ibm.model.GetCustomerByIdResponseWrapper;

public interface GetCustomerByIdI {

    public GetCustomerByIdResponseWrapper execute(GetCustomerByIdP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
