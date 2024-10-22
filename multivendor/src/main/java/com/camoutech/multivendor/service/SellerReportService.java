package com.camoutech.multivendor.service;

import com.camoutech.multivendor.model.Seller;
import com.camoutech.multivendor.model.SellerReport;

public interface SellerReportService {

    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport(SellerReport sellerReport);
}
