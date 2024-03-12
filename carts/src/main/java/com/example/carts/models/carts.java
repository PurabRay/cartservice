package com.example.carts.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class carts {
    private Integer cartid;
    private product Product;
    public Integer getCartId(){
        return cartid;
    }
    public void setCardId(Integer cartid){
        this.cartid=cartid;
    }

}
