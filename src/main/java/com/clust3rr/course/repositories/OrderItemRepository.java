package com.clust3rr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clust3rr.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
