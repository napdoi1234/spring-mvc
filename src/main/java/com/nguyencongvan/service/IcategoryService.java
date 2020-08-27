package com.nguyencongvan.service;

import org.springframework.data.domain.Pageable;

import com.nguyencongvan.dto.CategoryDTO;
import com.nguyencongvan.entity.CategoryEntity;

public interface IcategoryService {

	CategoryDTO findAll(Pageable pageable);
	
	CategoryEntity findById(Long id);
}
