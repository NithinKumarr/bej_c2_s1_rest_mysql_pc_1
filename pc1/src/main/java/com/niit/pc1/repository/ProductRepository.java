package com.niit.pc1.repository;

import com.niit.pc1.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    public List<Product>findByproductId(Integer productId);

}
