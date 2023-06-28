package com.ivoyant.learnfactorybean.service;

import com.ivoyant.deliverylib.service.DeliveryService;
import org.springframework.stereotype.Service;

@Service
public interface DeliveryRegistry {
    public DeliveryService getServiceBean(String serviceName);
}
