package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-02T07:10:08.531Z[GMT]")

public class Cart   {
  @JsonProperty("cart_id")
  private String cartId;

  @JsonProperty("customerid")
  private String customerid;

  @JsonProperty("itemid")
  private String itemid;

  @JsonProperty("quantity")
  private Integer quantity;

  public Cart cartId(String cartId) {
    this.cartId = cartId;
    return this;
  }

  /**
   * Get cartId
   * @return cartId
  */
  @ApiModelProperty(value = "")


  public String getCartId() {
    return cartId;
  }

  public void setCartId(String cartId) {
    this.cartId = cartId;
  }

  public Cart customerid(String customerid) {
    this.customerid = customerid;
    return this;
  }

  /**
   * Get customerid
   * @return customerid
  */
  @ApiModelProperty(value = "")


  public String getCustomerid() {
    return customerid;
  }

  public void setCustomerid(String customerid) {
    this.customerid = customerid;
  }

  public Cart itemid(String itemid) {
    this.itemid = itemid;
    return this;
  }

  /**
   * Get itemid
   * @return itemid
  */
  @ApiModelProperty(value = "")


  public String getItemid() {
    return itemid;
  }

  public void setItemid(String itemid) {
    this.itemid = itemid;
  }

  public Cart quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.cartId, cart.cartId) &&
        Objects.equals(this.customerid, cart.customerid) &&
        Objects.equals(this.itemid, cart.itemid) &&
        Objects.equals(this.quantity, cart.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartId, customerid, itemid, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    customerid: ").append(toIndentedString(customerid)).append("\n");
    sb.append("    itemid: ").append(toIndentedString(itemid)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

