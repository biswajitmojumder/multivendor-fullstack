/**
 * Created by camoutech
 * Date :19/10/2024
 * Time :00:06
 * Project Name :multivendor
 */

package com.camoutech.multivendor.request;

import lombok.Data;

@Data
public class AddItemRequest {
    private String size;
    private int quantity;
    private Long productId;
}
