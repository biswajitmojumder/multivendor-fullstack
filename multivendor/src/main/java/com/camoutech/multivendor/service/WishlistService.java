package com.camoutech.multivendor.service;

import com.camoutech.multivendor.model.Product;
import com.camoutech.multivendor.model.User;
import com.camoutech.multivendor.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);
    Wishlist getWishlistByUserId(User user);
    Wishlist addProductToWishlist(User user, Product product);
}
