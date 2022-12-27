package com.niit.pc1.controller;

import com.niit.pc1.domain.Product;
import com.niit.pc1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @PostMapping("/product")
    public ResponseEntity<?>saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/product")
    public ResponseEntity<?>getAllProduct(){
        return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
    }
    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id){
        return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
    }
//    @PutMapping("/product")
//    public ResponseEntity<?>updateProduct(@RequestBody Product product){
//        return new ResponseEntity<>(productService.updateProduct(product),HttpStatus.OK);
//    }
//    @GetMapping("/product/{productName}")
//    public ResponseEntity<?>getAllProductByproductName(productName),
}
