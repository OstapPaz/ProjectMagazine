package com.defence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.defence.service.impl.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired private UserDetailsServiceImpl udsi;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.udsi)
		.passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.formLogin()
				.usernameParameter("login")
				.passwordParameter("password")
				.loginPage("/login")
//				.loginProcessingUrl("/login")
				.successHandler(new CustomAuthenticationSuccesHandler())
				.failureUrl("/login?fail=true")
			.and()
				.logout()
				.logoutUrl("/logout")
				.deleteCookies("JSESSIONID", "rememberMeCookieName")
				.invalidateHttpSession(true)
			.and()
				.authorizeRequests()
				.antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
				.anyRequest().permitAll()
			.and()	
				.exceptionHandling().accessDeniedPage("/")
			.and()
				.sessionManagement().maximumSessions(1)
			.and().and()
				.rememberMe()
				.rememberMeParameter("rememberMe")
				.key("my key")
				.rememberMeCookieName("rememberMeCookieName")
				.tokenValiditySeconds(365 * 24 * 60 * 60);
				
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}

	
	
	
}
