package com.nguyencongvan.dto;

import com.nguyencongvan.entity.CommentEntity;

public class CommentDTO extends AbstractDTO<CommentEntity>{

	private UserDTO user;
	
	private String content;
	
	private NewsDTO news;

	public NewsDTO getNews() {
		return news;
	}

	public void setNews(NewsDTO news) {
		this.news = news;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
