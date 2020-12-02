package com.ibm.services;

import com.ibm.model.AddCartP;
import com.ibm.model.AddCartResponseWrapper;

public interface AddCartI {

    public AddCartResponseWrapper execute(AddCartP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
