package com.hdu.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdu.library.entry.User;
import com.hdu.library.mapper.UserMapper;
import com.hdu.library.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required=true)
	UserMapper userMapper;
	
	@Override
	public boolean checkuser(String name, String pwd) {
		// TODO Auto-generated method stub
		
		User user = userMapper.selectByName(name);
		if(user != null && user.getuPwd().equals(pwd)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkuser(String name) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByName(name);
		if (user == null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean adduser(User user) {
		// TODO Auto-generated method stub
		int i = userMapper.insertSelective(user);
		if(i > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deluser(String name) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByName(name);
		if(user == null) {
			return false;
		}else {
			int i = userMapper.deleteByPrimaryKey(user.getuId());
			if (i > 0) {
				return true;
			}else {
				return false;
			}
		}
	}
}
