package org.example.electronicshop.dto.request;

public class CartCreationRequest {

    private Long userId;

    public CartCreationRequest() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}