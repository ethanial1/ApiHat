package com.blackhat.apihat.ProductDAO;

import com.blackhat.apihat.entitys.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Long>{
    
}
