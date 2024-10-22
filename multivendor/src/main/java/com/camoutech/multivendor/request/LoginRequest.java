/**
 * Created by camoutech
 * Date :16/10/2024
 * Time :00:20
 * Project Name :multivendor
 */

package com.camoutech.multivendor.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String otp;
}
