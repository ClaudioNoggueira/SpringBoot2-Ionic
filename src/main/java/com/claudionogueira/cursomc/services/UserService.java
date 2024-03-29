package com.claudionogueira.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.claudionogueira.cursomc.security.UserSS;

public class UserService {

	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			//returns always null
		} catch (Exception e) {
			return null;
		}
	}
}
