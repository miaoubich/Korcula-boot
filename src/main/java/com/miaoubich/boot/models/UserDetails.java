package com.miaoubich.boot.models;

public interface UserDetails {

	public String getPassword();
	public String getUsername();
	public boolean isAccountNonExpired();
	public boolean isAccountNonLocked();
	public boolean isCredentialsNonExpired();
	public boolean isEnabled();
}
