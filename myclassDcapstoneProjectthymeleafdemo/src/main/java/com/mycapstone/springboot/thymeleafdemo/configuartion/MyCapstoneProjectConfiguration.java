package com.mycapstone.springboot.thymeleafdemo.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class MyCapstoneProjectConfiguration {

	 @Bean
	  public PasswordEncoder passwordEncoder () {
	    return new BCryptPasswordEncoder();
	 }
}
