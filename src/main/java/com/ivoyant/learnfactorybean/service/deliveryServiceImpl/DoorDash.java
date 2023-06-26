package com.ivoyant.learnfactorybean.service.deliveryServiceImpl;

import com.ivoyant.learnfactorybean.model.DeliveryRequest;
import com.ivoyant.learnfactorybean.service.DeliveryService;
import org.springframework.stereotype.Service;

@Service("DoorDash")
public class DoorDash implements DeliveryService {
    @Override
    public String deliver(DeliveryRequest deliveryRequest) {
        return deliveryRequest.getOrderId() + " is delivered using " + deliveryRequest.getDeliveryMethod();
    }
}
