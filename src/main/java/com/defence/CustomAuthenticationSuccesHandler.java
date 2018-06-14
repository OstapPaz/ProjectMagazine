package com.defence;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
public class CustomAuthenticationSuccesHandler implements AuthenticationSuccessHandler {
	
	private RedirectStrategy rs = new DefaultRedirectStrategy(); 
	
	public RedirectStrategy getRs() {
		return rs;
	}

	public void setRs(RedirectStrategy rs) {
		this.rs = rs;
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		handle(request, response, authentication);
		clearAuthenticationAttrebute(request);
		
	}
	
	private void handle(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException {
		String targetUrl = determainateTargetUrl(authentication);
		
		if(response.isCommitted()) {
			return;
		}
		
		rs.sendRedirect(request, response, targetUrl);
		
	}
	
	private String determainateTargetUrl (Authentication auth) {
		boolean isAdmin = false;
		boolean isUser = false;
		
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
		
		for(GrantedAuthority authority : authorities) {
			if(authority.getAuthority().equals("ROLE_ADMIN")) {
				isAdmin = true;
				break;
			} else if(authority.getAuthority().equals("ROLE_USER")) {
				isUser = true;
				break;
			}
		}
		
		if(isAdmin) {
			return "/my-profile";
		}
		if(isUser) {
			return "/my-profile";
		}
		
		return null;
	}
	
	private void clearAuthenticationAttrebute(HttpServletRequest request ) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			return;
		}
		
		session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
	}

	
	
}
