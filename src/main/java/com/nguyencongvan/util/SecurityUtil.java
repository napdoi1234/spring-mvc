package com.nguyencongvan.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import com.nguyencongvan.dto.SessionUser;

public class SecurityUtil {
	
	public static SessionUser getPrincipal() {
		SessionUser user= (SessionUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal(); 
		return user;
	}
	
	public static List<String> getAuthorities(){
		List<String> result=new ArrayList<String>();
		@SuppressWarnings("unchecked")
		List<GrantedAuthority> authorities= (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		for(GrantedAuthority author:authorities) {
			result.add(author.getAuthority());
		}
		return result;
		
	}
}
