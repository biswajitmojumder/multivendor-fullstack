/**
 * Created by camoutech
 * Date :17/10/2024
 * Time :17:45
 * Project Name :multivendor
 */

package com.camoutech.multivendor.request;

import lombok.Data;

import java.util.List;

@Data
public class CreateProductRequest {
    private String title;
    private String description;
    private int mrpPrice;
    private int sellingPrice;
    private String color;
    private List<String> images;
    private String category;
    private String category2;
    private String category3;
    private String sizes;
}
