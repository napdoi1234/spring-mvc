package com.nguyencongvan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class CommentEntity extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private UserEntity user;
	
	@Column(name="content")
	private String content;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="news_id")
	private NewsEntity news;
	
	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public NewsEntity getNews() {
		return news;
	}

	public void setNews(NewsEntity news) {
		this.news = news;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
