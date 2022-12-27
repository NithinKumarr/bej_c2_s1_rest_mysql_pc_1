package com.niit.pc1.service;

import com.niit.pc1.domain.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);
    public List<Product> getAllProduct();
    public String deleteProduct(Integer productId);


}
