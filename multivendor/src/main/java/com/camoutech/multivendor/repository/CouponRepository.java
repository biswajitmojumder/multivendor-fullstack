package com.camoutech.multivendor.repository;

import com.camoutech.multivendor.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String code);
}
