package com.ibm.api;

import com.ibm.model.Cart;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.ibm.services.AddCartI;
import com.ibm.model.AddCartP;
import com.ibm.model.AddCartResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.ibm.services.GetCustomerByIdI;
import com.ibm.model.GetCustomerByIdP;
import com.ibm.model.GetCustomerByIdResponseWrapper;
import com.ibm.services.DeleteCartBycustomerIdI;
import com.ibm.model.DeleteCartBycustomerIdP;
import com.ibm.model.DeleteCartBycustomerIdResponseWrapper;
import com.ibm.services.DeleteByItemidI;
import com.ibm.model.DeleteByItemidP;
import com.ibm.model.DeleteByItemidResponseWrapper;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-02T07:10:08.531Z[GMT]")

@RestController
public class ApiApiController implements ApiApi {

	@Autowired
	DeleteByItemidI deleteByItemidI;


	@Autowired
	DeleteCartBycustomerIdI deleteCartBycustomerIdI;


	@Autowired
	GetCustomerByIdI getCustomerByIdI;


	@Autowired
	AddCartI addCartI;


    public ResponseEntity<Void> addCart(@ApiParam(value = "Cart object that needs to be added to the eStore" ,required=true )  @Valid @RequestBody Cart body){
        
        AddCartResponseWrapper res  = addCartI.execute(new AddCartP(body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> deleteByItemid(@ApiParam(value = "",required=true) @PathVariable("customerid") String customerid,@ApiParam(value = "Itemid to delete",required=true) @PathVariable("itemid") String itemid){
        
        DeleteByItemidResponseWrapper res  = deleteByItemidI.execute(new DeleteByItemidP(customerid, itemid));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> deleteCartBycustomerId(@ApiParam(value = "customer id to delete",required=true) @PathVariable("customerid") String customerid){
        
        DeleteCartBycustomerIdResponseWrapper res  = deleteCartBycustomerIdI.execute(new DeleteCartBycustomerIdP(customerid));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<List<Cart>> getCustomerById(@ApiParam(value = "ID of Customer to return",required=true) @PathVariable("customerid") String customerid){
        
        GetCustomerByIdResponseWrapper res  = getCustomerByIdI.execute(new GetCustomerByIdP(customerid));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
