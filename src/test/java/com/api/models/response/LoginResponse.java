package com.api.models.response;

import java.util.List;

public class LoginResponse {
	
	private String token; 
	private String type;
	private int id;
	private String username;
	private List<String> roles;
	private String email;
	
	public LoginResponse() {
		
	}
	public LoginResponse(String token, String type, int id, String username, List<String> roles, String email) {
		super();
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.roles = roles;
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginResponse [token=" + token + ", type=" + type + ", id=" + id + ", username=" + username + ", roles="
				+ roles + ", email=" + email + "]";
	}
	

}
