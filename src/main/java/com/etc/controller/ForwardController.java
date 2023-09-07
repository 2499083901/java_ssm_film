package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForwardController {

	/**
	 * 和环境解耦
	 * 
	 * @param map
	 *            ModelMap 通过和环境解耦，就可以模拟环境，批量化的测试
	 */
	@RequestMapping(value = "/user/login2")
	public String login2(@RequestParam("n") String name, @RequestParam("p") String pwd, ModelMap map) {
		System.out.println(name);
		System.out.println(pwd);
		map.put("username", name);
		return "forward:/welcome.jsp";
	}

	/**
	 * 新增加 视图解析器
	 */
	@RequestMapping(value = "/user/login3")
	public String login3(@RequestParam("n") String name, @RequestParam("p") String pwd, ModelMap map) {
		System.out.println(name);
		System.out.println(pwd);
		map.put("username", name);
//		 return "forward:/WEB-INF/jsp/admin/wel.jsp";
		return "admin/wel";
	}

	@RequestMapping(value = "/baidu")
	public String baidu() {
		return "redirect:http://www.baidu.com";
	}

	/**
	 * ModelAndView 换了一种包装方式，在ModelAndView中包含了ModelMap
	 * http://localhost:8080/springmvc_03_forward/user/login4.do?n=jack&p=123
	 */
	@RequestMapping(value = "/user/login4")
	public ModelAndView login4(@RequestParam("n") String name, @RequestParam("p") String pwd) {
		System.out.println(name);
		System.out.println(pwd);
		ModelAndView mv = new ModelAndView();
		// 设置往哪里跳转
		mv.setViewName("admin/wel");
		mv.getModelMap().put("username", name);
		return mv;
	}
}
