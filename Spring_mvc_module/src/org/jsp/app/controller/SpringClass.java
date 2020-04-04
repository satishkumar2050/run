package org.jsp.app.controller;

import org.jsp.app.model.JpaMainClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringClass
{

	@RequestMapping("/view/userInfo")
	public ModelAndView userInfo(@RequestParam("n1") String name,@RequestParam("n2") String number,@RequestParam("n3") String email,@RequestParam("n4") String password)
	{
		String su="successfully registered";
		JpaMainClass jpaMainClass=new JpaMainClass();
		jpaMainClass.register(name,number,email,password);

		ModelAndView modelAndView=new ModelAndView("result","identifier",su);
		return modelAndView;
	}
	@RequestMapping("/view/signIn")
	public ModelAndView signIn(@RequestParam("phone")String phone ,@RequestParam("pass")String password)
	{
		String ss="successfully logged in!!";
		JpaMainClass jpaMainClass=new JpaMainClass();
		jpaMainClass.signIn(phone,password);
		ModelAndView modelAndView= new ModelAndView("result","identifier",ss);		
		return modelAndView;
	}
	@RequestMapping("/view/change")
	public ModelAndView change(@RequestParam("n1") String number,@RequestParam("n2") String email,@RequestParam("n3") String password)
	{
		String sc="data changed successfully";
		JpaMainClass jpaMainClass=new JpaMainClass();
		jpaMainClass.change(number,email,password);
		ModelAndView modelAndView=new ModelAndView("result", "identifier", sc);
		return modelAndView;
	}
	@RequestMapping("/view/remove")
	public ModelAndView remove(@RequestParam("n1") String number)
	{
		String sm="data removed successfully";
		JpaMainClass jpaMainClass=new JpaMainClass();
		jpaMainClass.remove(number);
		ModelAndView modelAndView=new ModelAndView("result", "identifier",sm );
		return modelAndView;
	}

}
