package com.ivoyant.learnfactorybean.config;

import com.ivoyant.learnfactorybean.service.DeliveryRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeliverySLConfig {
    @Bean
    public FactoryBean<?> getBean(){
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(DeliveryRegistry.class);
        return bean;
    }
}
