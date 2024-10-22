package com.camoutech.multivendor.repository;

import com.camoutech.multivendor.domain.AccountStatus;
import com.camoutech.multivendor.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller, Long> {

    Seller findByEmail(String email);
    List<Seller> findByAccountStatus(AccountStatus status);
}
