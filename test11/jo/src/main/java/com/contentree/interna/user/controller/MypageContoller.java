package com.contentree.interna.user.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
class MypageControllerController {
	
    @RequestMapping("/mypage")
    public ModelAndView goMypage() {
    	//유저 정보를 얻어온다
    	ModelAndView model = new ModelAndView();
    	model.setViewName("mypage");
  	
    	return model;
    }
}