package com.camoutech.multivendor.repository;

import com.camoutech.multivendor.model.HomeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeCategoryRepository extends JpaRepository<HomeCategory, Long> {
}
