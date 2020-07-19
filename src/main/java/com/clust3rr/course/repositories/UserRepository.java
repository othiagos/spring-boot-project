package com.clust3rr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clust3rr.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
