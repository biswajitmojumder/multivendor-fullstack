/**
 * Created by camoutech
 * Date :13/10/2024
 * Time :18:37
 * Project Name :multivendor
 */

package com.camoutech.multivendor.response;

import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String fullName;
    private String otp;
}
