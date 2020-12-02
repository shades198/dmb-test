package com.ibm.model;

import org.springframework.http.ResponseEntity;

public class DeleteByItemidP {

    private String customerid;
    private String itemid;

    public DeleteByItemidP() {

    }

    public DeleteByItemidP(String customerid,String itemid) {
        this.customerid = customerid;
        this.itemid = itemid;
    }

    public String getCustomerid () {
        return customerid;
    }

    public void setCustomerid (String customerid) {
        this.customerid = customerid;
    }
    public String getItemid () {
        return itemid;
    }

    public void setItemid (String itemid) {
        this.itemid = itemid;
    }

}
