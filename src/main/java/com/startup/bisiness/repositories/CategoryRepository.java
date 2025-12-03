package com.startup.bisiness.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.startup.bisiness.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
