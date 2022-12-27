package com.niit.pc1.service;

import com.niit.pc1.domain.Product;
import com.niit.pc1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) {
        if(productRepository.findByproductId(product.getProductId()).isEmpty()){
           return productRepository.save(product);
       }
      return null ;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public String deleteProduct(Integer productId) {
        if (productRepository.findByproductId(productId).isEmpty()) {
           return "user does not exist";
       }
       productRepository.deleteById(productId);
       return "user deleted successfully";
  }
}

