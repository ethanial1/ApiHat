package com.blackhat.apihat.rest;

import java.util.List;

import com.blackhat.apihat.entitys.Product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRest {
    
    @RequestMapping(value = "/products")
    public ResponseEntity<List<Product>> getProduct () {
        
        return null;
        //return ResponseEntity.ok();
    }
}
