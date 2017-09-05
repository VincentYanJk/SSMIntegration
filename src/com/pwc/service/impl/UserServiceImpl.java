package com.pwc.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;







import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.dao.UserDao;
import com.pwc.pojo.User;
import com.pwc.vo.Message;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

@Service
public class UserServiceImpl  {
private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
	private UserDao userDao;
	

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		System.out.println("invoke service");
		List<User> results = new ArrayList<User>();
		results = userDao.findAllUser();
		
		if(results==null)
		return java.util.Collections.EMPTY_LIST;

		return results;
	}

	public void insertUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("invoke service");
		userDao.insert(user);
		

	}
	
	public Message logoOn(User user){
		try {
            Message message = new Message();
			List<User> users=userDao.selectUsers(user);
			if(users==null||users.size()==0){

				
				message.setStatus("FAIL");
				message.setMsg("Logoin Failure!");
			}else{
				message.setStatus("SUCCESS");
				message.setMsg("Logoin sucessful!");
			}
			return message;
		} catch (Exception e) {
			
		}
		return null;
	}

}
