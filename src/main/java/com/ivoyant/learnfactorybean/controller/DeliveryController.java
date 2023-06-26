package com.ivoyant.learnfactorybean.controller;

import com.ivoyant.learnfactorybean.model.DeliveryRequest;
import com.ivoyant.learnfactorybean.service.DeliveryRegistry;
import com.ivoyant.sdlibrary.HelloLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {
    @Autowired
    DeliveryRegistry deliveryRegistry;
    @Autowired
    HelloLibraryService helloLibraryService;

    @PostMapping("/deliver")
    public String deliveryProcess(@RequestBody DeliveryRequest deliveryRequest){
        String response = "";
        response = deliveryRegistry.getServiceBean(deliveryRequest.getDeliveryMethod()).deliver(deliveryRequest);
        return response;
    }

    @GetMapping("/")
    public String callCustomLib(){
        return helloLibraryService.sayHello();
    }
}
