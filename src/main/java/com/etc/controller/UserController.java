package com.etc.controller;

import com.etc.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	/**
	 * @ModelAttribute 不仅仅和从页面中获取对象的所有属性，而且可以将对象放入request当中
	 * 
	 * 内容：
	 * 1、@ModelAttribute 的使用
	 * 2、@DateTimeFormat(pattern="yyyy-MM-dd")的使用
	 */
	@RequestMapping("/add")
	public String add(@ModelAttribute("user") User user){
		System.out.println(user.getUserName());
		System.out.println(user.getPassWord());
		System.out.println(user.getBirthday());
		return "b";
	}
	
	/**
	 * 内容：
	 * 1、使用REST风格获取用户的ID
	 * 2、@PathVariable标签的使用
	 * 3、在web.xml中需要将url-pattern设置为/
	 */
	@RequestMapping(value="/view/{id}",method=RequestMethod.GET)
	public String view(@PathVariable String id,Model model){
		System.out.println("使用REST风格得到用户ID："+id);
		model.addAttribute("mes", "得到用户的ID:"+id+"，通过REST风格");
		return "c";
	}
	
}
