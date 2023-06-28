package com.ivoyant.learnfactorybean.service.deliveryServiceImpl;

import com.ivoyant.deliverylib.model.DeliveryRequest;
import com.ivoyant.deliverylib.service.DeliveryService;
import org.springframework.stereotype.Service;

@Service("UberEats")
public class UberEats implements DeliveryService {
    @Override
    public String deliver(DeliveryRequest deliveryRequest) {
        return deliveryRequest.getOrderId() + " is delivered using " + deliveryRequest.getDeliveryMethod();
    }
}
