package org.example.electronicshop.dto.request;

import java.math.BigDecimal;

public class OrderCreationRequest {

    private Long userId;
    private BigDecimal totalPrice;

    public OrderCreationRequest() {}

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}