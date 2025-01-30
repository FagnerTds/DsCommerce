package com.fagnertds.DsCommerce.repositories;

import com.fagnertds.DsCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
