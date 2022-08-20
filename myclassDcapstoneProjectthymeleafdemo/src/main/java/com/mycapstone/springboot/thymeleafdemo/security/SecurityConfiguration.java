package com.mycapstone.springboot.thymeleafdemo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class SecurityConfiguration {
  
  @Autowired
  private PasswordEncoder passwordEncoder;
 
   
  public void addResourceHandlers(ResourceHandlerRegistry registry) 
  {
      registry
      .addResourceHandler
              (
              "/webjars/**",
              "/img/**",
              "/css/**",
              "/js/**"
              )
              .addResourceLocations
                 (
                      "classpath:/META-INF/resources/webjars/",
                      "classpath:/static/img/",
                      "classpath:/static/css/",
                      "classpath:/static/js/"
                 );
  }
  @Bean
  protected UserDetailsService userDeatil(BCryptPasswordEncoder bCryptPasswordEncoder) throws Exception {
	  InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	  manager.createUser(User.withUsername("rash@gmail.com").password(bCryptPasswordEncoder.encode("d"))
			  .roles("USER").build());
	  
	  	return manager;

  }
  @Bean
  protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
      .csrf().disable()
      .authorizeRequests()
        .antMatchers("/takeTest/**").hasAnyRole("USER")
        .anyRequest().hasAnyRole("USER").and()
      .formLogin()
        .loginPage("/login")
        .defaultSuccessUrl("/takeTest")

        .permitAll();
	return http.build();
  }
}