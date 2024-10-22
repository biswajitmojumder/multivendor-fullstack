/**
 * Created by camoutech
 * Date :17/10/2024
 * Time :16:06
 * Project Name :multivendor
 */

package com.camoutech.multivendor.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {
    private String error;
    private String details;
    private LocalDateTime timestamp;
}
