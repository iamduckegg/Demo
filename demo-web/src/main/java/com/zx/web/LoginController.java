package com.zx.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zx.entity.User;
import com.zx.service.UserService;

@Controller
@RequestMapping("demo")
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("index");
		List<User> userList = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		try {
		
			userList = userService.queryUserList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		mv.addObject("user", userList);
		request.setAttribute("user1", userList);
		return mv;
	}

}
