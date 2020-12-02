package com.ibm.model;

import org.springframework.http.ResponseEntity;
import java.util.List;
import com.ibm.model.Cart;

public class GetCustomerByIdP {

    private String customerid;

    public GetCustomerByIdP() {

    }

    public GetCustomerByIdP(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomerid () {
        return customerid;
    }

    public void setCustomerid (String customerid) {
        this.customerid = customerid;
    }

}
