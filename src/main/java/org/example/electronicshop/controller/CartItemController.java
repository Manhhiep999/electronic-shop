package org.example.electronicshop.controller;

import org.example.electronicshop.dto.request.CartItemCreationRequest;
import org.example.electronicshop.model.CartItem;
import org.example.electronicshop.service.CartItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart-items")
public class CartItemController {

    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @PostMapping
    public CartItem addProductToCart(@RequestBody CartItemCreationRequest request) {
        return cartItemService.addProductToCart(request);
    }

    @GetMapping
    public List<CartItem> getCartItems() {
        return cartItemService.getCartItems();
    }
}