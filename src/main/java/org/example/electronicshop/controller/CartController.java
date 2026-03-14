package org.example.electronicshop.controller;

import org.example.electronicshop.dto.request.CartCreationRequest;
import org.example.electronicshop.model.Cart;
import org.example.electronicshop.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public Cart createCart(@RequestBody CartCreationRequest request) {
        return cartService.createCart(request);
    }

    @GetMapping
    public List<Cart> getCarts() {
        return cartService.getCarts();
    }
}