package com.ibm.services;

import com.ibm.model.DeleteByItemidP;
import com.ibm.model.DeleteByItemidResponseWrapper;

public interface DeleteByItemidI {

    public DeleteByItemidResponseWrapper execute(DeleteByItemidP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
