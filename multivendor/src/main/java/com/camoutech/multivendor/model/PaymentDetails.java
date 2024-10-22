/**
 * Created by camoutech
 * Date :13/10/2024
 * Time :15:01
 * Project Name :multivendor
*/

package com.camoutech.multivendor.model;

import com.camoutech.multivendor.domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {
    private String paymentId;
    private String razorpayPaymentLinkId;
    private String razorpayPaymentLinkReferenceId;
    private String razorpayPaymentLinkStatus;
    private String razorpayPaymentId;
    private PaymentStatus status;
}
