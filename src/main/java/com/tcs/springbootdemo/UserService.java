package com.tcs.springbootdemo;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

@Service
public class UserService  implements IUserServices{
	@Override

	public void save(com.tcs.springbootdemo.User user) {
		// TODO Auto-generated method stub
		System.out.println("saved");
	}
	

}
