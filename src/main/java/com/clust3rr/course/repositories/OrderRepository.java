package com.clust3rr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clust3rr.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
