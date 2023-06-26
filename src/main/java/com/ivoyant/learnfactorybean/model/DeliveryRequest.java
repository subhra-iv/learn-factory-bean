package com.ivoyant.learnfactorybean.model;

import lombok.Data;

@Data
public class DeliveryRequest {
    private String orderId;
    private String deliveryMethod;
}
