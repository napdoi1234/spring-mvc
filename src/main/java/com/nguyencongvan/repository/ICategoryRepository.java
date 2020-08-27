package com.nguyencongvan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nguyencongvan.entity.CategoryEntity;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long>{
	CategoryEntity findOneById(Long id);
}
