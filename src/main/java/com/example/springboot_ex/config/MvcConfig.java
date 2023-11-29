package com.example.springboot_ex.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);

        // 컨트롤러 로직 없이 바로 뷰를 리턴하는 경우 ViewController 사용
        registry.addViewController("/").setViewName("/home/home");
        registry.addViewController("/home/home").setViewName("/home/home");
        registry.addViewController("/member/list").setViewName("/member/member_list");
    }
}
