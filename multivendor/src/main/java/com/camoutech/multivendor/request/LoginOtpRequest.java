/**
 * Created by camoutech
 * Date :16/10/2024
 * Time :23:35
 * Project Name :multivendor
 */

package com.camoutech.multivendor.request;

import com.camoutech.multivendor.domain.USER_ROLE;
import lombok.Data;

@Data
public class LoginOtpRequest {
    private String email;
    private String otp;
    private USER_ROLE role;
}
