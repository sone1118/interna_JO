package com.contentree.interna.user.controller;

import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
class LoginController {
	// '/'
	//경로로 리프레쉬, 엑세스가 둘다 들어왔을 경우 js에서 둘다 쿠키에 저장
	//쿠키에 값이 있을 경우 login을 유지하고, access 토큰을 붙여서 user 정보 받아와서 view 뿌리기
	//js에서 쿠키에 값이 있을 경우에는 
	
	
    @RequestMapping("/")
    public ModelAndView home(@RequestParam(value = "error", required = false) String error) {

    	ModelAndView model = new ModelAndView();
    	model.setViewName("home");
    	//error가 있으면 error메세지 보내서 출력하기
    	if(error != null) model.addObject("error_message", "중복 가입된 정보가 있습니다.");
    	
    	return model;
    }
    
//    @RequestMapping("/login")
//    public token login() {
    
    	//sns 로그인 시도
    	//로그인이 성공하면 js프론트로 return token을 보내줌
    
    	//로그인이 실패하면 return error를 보내줌

//    }
   
    @RequestMapping("/test")
    public ModelAndView testHome() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("test");
    	model.addObject("testValue", "안녕");
    	return model;
    
    }
//    @RequestMapping("/test")
//    public ModelAndView testLogin() {
//    	ModelAndView model = new ModelAndView();
//    	model.setViewName("login");	
//    	return model;
//    }
//    
    //로그인 할때 local 확인해서 token 있으면 로그인 후 화면 보여주면됨.

//카카오에서 로그인을 한후에 session에 token이 있을때 "/"로 왔을때
//    
//    @RequestMapping()
//    public String singnIn(HttpServletRequest request) {
//    	HttpSession session = request.getSession();
//
//    	return "redirect:/";
//    }
    
    //login상태 유지
//    @RequestMapping()
//    public String logIn(Model model) {
//    	model.addAllAttributes("logIn", true);
//    	return login;
//    };
    
}
