package com.clust3rr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clust3rr.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
