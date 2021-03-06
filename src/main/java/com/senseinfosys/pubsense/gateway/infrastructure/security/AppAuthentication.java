package com.senseinfosys.pubsense.gateway.infrastructure.security;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class AppAuthentication implements Authentication {

	private static final long serialVersionUID = 4569259191013858943L;

	private final String appId;

	private boolean authenticated = true;

	public AppAuthentication(String appId) {
		this.appId = appId;
	}

	@Override
	public String getName() {
		return appId;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_APP"));
	}

	@Override
	public Object getCredentials() {
		return appId;
	}

	@Override
	public Object getDetails() {
		return appId;
	}

	@Override
	public Object getPrincipal() {
		return appId;
	}

	@Override
	public boolean isAuthenticated() {
		return authenticated;
	}

	@Override
	public void setAuthenticated(boolean isAuthenticated) {
		this.authenticated = isAuthenticated;
	}

}
