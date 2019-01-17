package com.zx.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zx.service.UserService;

@Controller
@RequestMapping("demo")
public class LoginController {

	@SuppressWarnings("unused")
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="")
	public ModelAndView tologin(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request,String username, String password){
		ModelAndView mv = new ModelAndView();
		
		//验证账号密码，如果符合则改变session里的状态，并重定向到主页
        if ("zx".equals(username)&&"123".equals(password)){
            request.getSession().setAttribute("isLogin","yes");
            mv.setViewName("index");
            return mv;
        }else {
            //密码错误则重定向回登录页，并返回错误，因为是重定向所要要用到RedirectAttributes
        	mv.setViewName("login");
            return mv;
        }
	}
	
	 //登出，移除登录状态并重定向的登录页
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpServletRequest request) {
        request.getSession().removeAttribute("isLogin");
        return "redirect:login";
    }
    
    @RequestMapping(value = "/index")
    public String indexPage(HttpServletRequest request){
        return "index";
    }
    
    @RequestMapping(value = "store")
    public String storePage(HttpServletRequest request){
    	return "store";
    }
    
}
