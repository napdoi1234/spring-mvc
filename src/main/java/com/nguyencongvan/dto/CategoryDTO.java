package com.nguyencongvan.dto;

import java.util.List;

import com.nguyencongvan.entity.CategoryEntity;

public class CategoryDTO extends AbstractDTO<CategoryEntity>{

	private String name;
	
	private List<NewsDTO> news;

	public String getName() {
		return name;
	}
	
	public List<NewsDTO> getNews() {
		return news;
	}
	public void setNews(List<NewsDTO> news) {
		this.news = news;
	}
	public void setName(String name) {
		this.name = name;
	}
}
