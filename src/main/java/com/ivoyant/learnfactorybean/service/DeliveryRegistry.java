package com.ivoyant.learnfactorybean.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface DeliveryRegistry {
    public DeliveryService getServiceBean(String serviceName);
}
