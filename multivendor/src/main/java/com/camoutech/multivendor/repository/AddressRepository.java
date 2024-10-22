package com.camoutech.multivendor.repository;

import com.camoutech.multivendor.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
