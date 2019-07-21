package com.demo.user.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeUserAction extends ActionSupport {

	private static final long serialVersionUID = 2374390320744044803L;
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute() throws Exception {
		if ("SECRET".equals(username)) {
			return "SUCCESS";
		} else {
			return "ERROR";
		}
		
	}
}