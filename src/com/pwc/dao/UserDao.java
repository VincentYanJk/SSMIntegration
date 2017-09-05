package com.pwc.dao;

import java.util.List;


import org.springframework.stereotype.Repository;



import com.pwc.pojo.User;
@Repository
public interface UserDao {

	public void insert(User user);
	
	public List<User> findById();
	
	public List<User> findAllUser();
	
	public List<User> selectUsers(User  user);
	
	
}
