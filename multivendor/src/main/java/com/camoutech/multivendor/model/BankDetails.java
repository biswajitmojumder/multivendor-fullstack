/**
 * Created by camoutech
 * Date :13/10/2024
 * Time :12:43
 * Project Name :multivendor
 */

package com.camoutech.multivendor.model;

import lombok.Data;

@Data
public class BankDetails {
    private String accountNumber;
    private String accountHolderName;
    private String ifscCode;
}
