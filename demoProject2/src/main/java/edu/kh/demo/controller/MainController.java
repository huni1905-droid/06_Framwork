package edu.kh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 요청/응답 제어 역할 명시 + Bean 등록
public class MainController {
	/* 
	 * 메인페이지에서부터 DB의 내용을 뿌려줘야하는 경우 
	 * 메인페이지가 index.html로 가는 것이 아닌 
	 * '/'로 요청이 가면 -> '/'를 Controller가(MainController) 받도록 함 
	 * 			-> DB -> 응답(forward) -> main.html
	 */
	// "/" 주소로 요청 시 main.html 파일로 forward
	@RequestMapping("/")
	public String mainPage() {
		
		// forward : 요청 위임
		// thymeleaf : Spring Boot에서 사용하는 템플릿 엔진 (html 파일 사용)
		// thymeleaf를 이용한 html로 forward 시
		// 사용되는 접두사, 접미사 존재
		
		// 접두사 : classpath:/templates/
		// 접미사 : .html
		
		// -> classpath:/templates/common/main.html
		return"common/main";
	}
	
	
	
	
	
	
}
