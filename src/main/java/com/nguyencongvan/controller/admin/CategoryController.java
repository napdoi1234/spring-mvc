package com.nguyencongvan.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nguyencongvan.dto.CategoryDTO;
import com.nguyencongvan.service.IcategoryService;
import com.nguyencongvan.service.impl.CategoryServiceImpl;

@Controller(value = "categoryControllerOfAdmin")
public class CategoryController {
	@Autowired
	IcategoryService categoryService;
	
	@RequestMapping(value = "/quan-tri/danh-sach", method = RequestMethod.GET)
	public ModelAndView showList(@RequestParam("currentPage") int currentPage,@RequestParam("limit") int limit) {
		ModelAndView mav= new ModelAndView("admin/category/list");
		Pageable pageable = new PageRequest(currentPage - 1, limit);
		CategoryDTO categoryDto=categoryService.findAll(pageable);
		categoryDto.setTotalPage(categoryDto.getTotalItem()/limit);
		mav.addObject("category",categoryDto);
		
		return mav;
	}
	@RequestMapping(value = "/quan-tri/chinh-sua", method = RequestMethod.GET)
	public ModelAndView edit(@RequestParam(value =  "id",required = false)Long id) {
		ModelAndView mav=  new ModelAndView("admin/category/edit");
		mav.addObject("category",categoryService.findById(id));
		return mav;
	}
}
