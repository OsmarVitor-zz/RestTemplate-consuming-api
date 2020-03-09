package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.model.Address;

@Service
public class ConsumerPostmonApiService{
    
   @Value("${url.postmon}")
   private String url;
  
    
    public Address consumer(String cep) {
        String fullUrl = url + cep;
        RestTemplate restTemplate = new RestTemplate();
        Address responseObject = restTemplate.getForObject(fullUrl, Address.class);
        return responseObject;
    }
    

}
