package com.clust3rr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clust3rr.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
