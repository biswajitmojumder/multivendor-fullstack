package com.camoutech.multivendor.repository;

import com.camoutech.multivendor.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist,Long> {

    Wishlist findByUserId(Long userId);
}
