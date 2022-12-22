package org.sid.inventoryservice.service;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


    @Service
    public class ProductService {
        @Autowired
        private ProductRepository repository;
        //INSERT
        public void addProduct(Product p) {
            repository.save(p);
        }

        //DELETE
        public String deleteProduct(int id) {
            repository.deleteById((long) id);
            return "Product removed !! " + id;
        }

    }