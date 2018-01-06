package com.german.tutorial.spring.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

@SpringBootApplication
public class MvcApplication implements WebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext container) {
		ServletRegistration.Dynamic registration =
				container.addServlet("dispatcher", new DispatcherServlet());
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}

}
