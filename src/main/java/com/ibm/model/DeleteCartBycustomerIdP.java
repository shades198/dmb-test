package com.ibm.model;

import org.springframework.http.ResponseEntity;

public class DeleteCartBycustomerIdP {

    private String customerid;

    public DeleteCartBycustomerIdP() {

    }

    public DeleteCartBycustomerIdP(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomerid () {
        return customerid;
    }

    public void setCustomerid (String customerid) {
        this.customerid = customerid;
    }

}
