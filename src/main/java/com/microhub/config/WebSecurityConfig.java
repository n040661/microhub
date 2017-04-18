//package com.microhub.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//				.authorizeRequests()
//				.antMatchers("/", "/home").permitAll()
//				.anyRequest().authenticated()
//				.and()
//				.formLogin()
//				.loginPage("/login")
//				.permitAll()
//				.and()
//				.logout()
//				.permitAll();
//	}
//
//
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//
//
//	}
//}