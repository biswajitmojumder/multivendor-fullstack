/**
 * Created by camoutech
 * Date :19/10/2024
 * Time :18:37
 * Project Name :multivendor
 */

package com.camoutech.multivendor.response;

import lombok.Data;

@Data
public class PaymentLinkResponse {
    private String payment_link_url;
    private String payment_link_id;
}
