package com.ibm.model;

import com.ibm.model.Cart;
import org.springframework.http.ResponseEntity;

public class AddCartP {

    private Cart body;

    public AddCartP() {

    }

    public AddCartP(Cart body) {
        this.body = body;
    }

    public Cart getBody () {
        return body;
    }

    public void setBody (Cart body) {
        this.body = body;
    }

}
