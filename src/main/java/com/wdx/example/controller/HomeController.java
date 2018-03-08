package com.wdx.example.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.wdx.example.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@Resource
	private DemoService demoService;


	@RequestMapping("/")
	public String index(HttpServletRequest request,Model model){
		
//		ExecuteResult<UserInfo> userResult = userService.getUserInfoBySesssion(request);
//		if(userResult.isSuccess()){
//			model.addAttribute("userInfo", userResult.getResult());
//			return "home";
//		}
		String result = demoService.wolcome("wdx");
		model.addAttribute("message",result);
		return "home";
	}

	public DemoService getDemoService() {
		return demoService;
	}

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}
}
