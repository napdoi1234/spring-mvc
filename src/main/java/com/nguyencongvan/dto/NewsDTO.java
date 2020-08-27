package com.nguyencongvan.dto;

import java.util.List;

import com.nguyencongvan.entity.NewsEntity;

public class NewsDTO extends AbstractDTO<NewsEntity>{

	private String title;
	
	private String content;
	
	private CategoryDTO category;
	
	private List<CommentDTO> comment;

	public List<CommentDTO> getComment() {
		return comment;
	}

	public void setComment(List<CommentDTO> comment) {
		this.comment = comment;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
