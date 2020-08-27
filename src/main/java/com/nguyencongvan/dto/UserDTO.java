package com.nguyencongvan.dto;

import java.util.List;

import com.nguyencongvan.entity.UserEntity;

public class UserDTO extends AbstractDTO<UserEntity>{

	private String userName;
	
	private String password;
	
	private String fullName;
	
	private List<RoleDTO> role;
	
	private List<CommentDTO> comment;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<RoleDTO> getRole() {
		return role;
	}

	public void setRole(List<RoleDTO> role) {
		this.role = role;
	}

	public List<CommentDTO> getComment() {
		return comment;
	}

	public void setComment(List<CommentDTO> comment) {
		this.comment = comment;
	}
}
