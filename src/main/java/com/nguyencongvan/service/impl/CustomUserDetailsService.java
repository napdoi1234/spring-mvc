package com.nguyencongvan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nguyencongvan.dto.SessionUser;
import com.nguyencongvan.entity.RoleEntity;
import com.nguyencongvan.entity.UserEntity;
import com.nguyencongvan.repository.IUserRepository;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity=userRepository.findOneByUserNameAndStatus(username, "active");
		if(userEntity==null) throw new UsernameNotFoundException("User not found");
		List<GrantedAuthority> authorities= new ArrayList<>();
		for(RoleEntity role: userEntity.getRole()) {
			authorities.add(new SimpleGrantedAuthority(role.getId().toString()));
		}
		SessionUser user=new SessionUser(userEntity.getUserName(), userEntity.getPassword(), true, true, true,
				true, authorities);
		user.setUserName(userEntity.getFullName());
		return user;
	}

}
