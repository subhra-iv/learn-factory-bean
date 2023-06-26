package com.ivoyant.learnfactorybean.config;

import com.ivoyant.sdlibrary.HelloLibraryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public HelloLibraryService helloLibraryService(){
        return new HelloLibraryService();
    }
}
