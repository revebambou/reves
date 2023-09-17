package com.reve.sample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SampleUser {
	private Integer id;
	private String username;
	private String password;
	private String job;
	@Override
	public String toString() {
		return "SampleUser [id=" + id + ", username=" + username + ", password=" + password + ", job=" + job + "]";
	}
	
	
}
