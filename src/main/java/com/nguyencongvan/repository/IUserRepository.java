package com.nguyencongvan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nguyencongvan.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Long>{
	UserEntity findOneByUserNameAndStatus(String name, String status);
}
