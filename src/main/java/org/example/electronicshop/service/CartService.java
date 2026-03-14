package org.example.electronicshop.service;

import org.example.electronicshop.dto.request.CartCreationRequest;
import org.example.electronicshop.model.Cart;
import org.example.electronicshop.model.User;
import org.example.electronicshop.repository.CartRepository;
import org.example.electronicshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final UserRepository userRepository;

    public CartService(CartRepository cartRepository, UserRepository userRepository) {
        this.cartRepository = cartRepository;
        this.userRepository = userRepository;
    }

    public Cart createCart(CartCreationRequest request) {

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Cart cart = new Cart();
        cart.setUser(user);

        return cartRepository.save(cart);
    }

    public List<Cart> getCarts() {
        return cartRepository.findAll();
    }
}