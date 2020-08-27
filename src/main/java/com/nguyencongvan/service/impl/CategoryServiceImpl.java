package com.nguyencongvan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nguyencongvan.converter.Convertor;
import com.nguyencongvan.dto.CategoryDTO;
import com.nguyencongvan.entity.CategoryEntity;
import com.nguyencongvan.repository.ICategoryRepository;
import com.nguyencongvan.service.IcategoryService;

@Service

public class CategoryServiceImpl implements IcategoryService{

	@Autowired
	ICategoryRepository categoryRepository;
	
	@Autowired
	Convertor<CategoryEntity,CategoryDTO> convert;
	
	@Override
	@Transactional
	public CategoryDTO findAll(Pageable pageable) {
		CategoryDTO result=new CategoryDTO();
		result.setList(categoryRepository.findAll(pageable).getContent());
		result.setTotalItem((int)categoryRepository.count());
		return result;
	}

	@Override
	@Transactional
	public CategoryEntity findById(Long id) {
		CategoryEntity result=categoryRepository.findOneById(id);
		return result;
	}

}
