package com.hdu.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdu.library.entry.User;
import com.hdu.library.mapper.UserMapper;
import com.hdu.library.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public boolean checkuser(String name, String pwd) {
		// TODO Auto-generated method stub
		
		User user = userMapper.selectByName(name);
		if(user.getuPwd().equals(pwd)) {
			return true;
		}
		return false;
	}
}
