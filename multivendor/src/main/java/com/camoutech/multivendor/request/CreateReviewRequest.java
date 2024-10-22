/**
 * Created by camoutech
 * Date :20/10/2024
 * Time :18:44
 * Project Name :multivendor
 */

package com.camoutech.multivendor.request;

import lombok.Data;

import java.util.List;

@Data
public class CreateReviewRequest {

    private String reviewText;
    private double reviewRating;
    private List<String> productImages;
}
