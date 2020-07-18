package com.tcs.spring.demo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext container) throws ServletException {
		// TODO Auto-generated method stub
		
		 AnnotationConfigWebApplicationContext dispatcherContext =
			        new AnnotationConfigWebApplicationContext();
			      dispatcherContext.register(WebMvcConfig.class);
			      
			      ServletRegistration.Dynamic dispatcher =
			    	        container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
			    	      dispatcher.setLoadOnStartup(1);
			    	       dispatcher.addMapping("/");
			 

	}

}
