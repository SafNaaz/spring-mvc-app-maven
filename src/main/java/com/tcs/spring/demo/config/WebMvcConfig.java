package com.tcs.spring.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.tcs.spring.demo"})
public class WebMvcConfig {
	

	   @Bean
	   public InternalResourceViewResolver resolver() {
	      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	      resolver.setViewClass(JstlView.class);
	      resolver.setPrefix("/views/");
	      resolver.setSuffix(".jsp");
	      return resolver;
	   }
	

}
