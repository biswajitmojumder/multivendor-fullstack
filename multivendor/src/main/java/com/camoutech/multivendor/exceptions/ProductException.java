/**
 * Created by camoutech
 * Date :17/10/2024
 * Time :17:24
 * Project Name :multivendor
 */

package com.camoutech.multivendor.exceptions;

import lombok.Data;


public class ProductException extends Exception{

    public ProductException(String message){
        super(message);
    }
}
