package com.pwc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RequestBody;
import com.pwc.pojo.User;
import com.pwc.service.impl.UserServiceImpl;
import com.pwc.vo.Message;


@Controller
public class UserController {
	private static Logger log=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserServiceImpl userService;
	

	
	@RequestMapping(value="/userList")
    public String userList(HttpServletRequest request,Model model){  
        //int userId = Integer.parseInt(request.getParameter("id"));  
    //    System.out.println("userId:"+userId);
		
		//     if (userId==1) {
		        
//		             user = new User();  
//		             user.setAge(11);
//		             user.setId(1);
//		             user.setPassword("123");
//		             user.setUserName("jjjj");
//        User user=null;

        List<User> users = userService.getAllUsers();
        
        
             model.addAttribute("users", users);
     //   }
       
        return "UserList";  
    }  
	
	
	@ResponseBody
	  @RequestMapping(value = "/logoOn", method = {RequestMethod.POST})
	  public Message logoOn(HttpServletRequest request, HttpServletResponse response,@RequestBody User user) {
		  System.out.println("ajax start");
		  
		  Message message = userService.logoOn(user);
	
		  return message;
	  }
	  

	

	

	
}
