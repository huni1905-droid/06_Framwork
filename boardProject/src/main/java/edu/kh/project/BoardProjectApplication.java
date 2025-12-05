package edu.kh.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) 
// @SpringBootApplication스프링이 굴러가기위한 필수 설정
// (exclude = {SecurityAutoConfiguration.class}) : Spring Security에서 기본제공하는 로그인 페이지를 이용 안하겠다.
public class BoardProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardProjectApplication.class, args);
	}

}
