/**
 * Created by camoutech
 * Date :14/10/2024
 * Time :16:13
 * Project Name :multivendor
 */

package com.camoutech.multivendor.response;

import com.camoutech.multivendor.domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;
}
