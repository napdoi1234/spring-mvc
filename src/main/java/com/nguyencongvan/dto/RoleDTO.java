package com.nguyencongvan.dto;

import java.util.List;

import com.nguyencongvan.entity.RoleEntity;

public class RoleDTO extends AbstractDTO<RoleEntity>{

	private List<UserDTO> user;
	
	private String roleName;

	public List<UserDTO> getUser() {
		return user;
	}

	public void setUser(List<UserDTO> user) {
		this.user = user;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
