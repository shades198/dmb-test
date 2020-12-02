package com.ibm.services;

import com.ibm.model.DeleteCartBycustomerIdP;
import com.ibm.model.DeleteCartBycustomerIdResponseWrapper;

public interface DeleteCartBycustomerIdI {

    public DeleteCartBycustomerIdResponseWrapper execute(DeleteCartBycustomerIdP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
