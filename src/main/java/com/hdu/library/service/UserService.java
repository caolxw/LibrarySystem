package com.hdu.library.service;

import com.hdu.library.entry.User;

public interface UserService {
	
	//检查用户名和密码
	boolean checkuser(String name, String pwd);
	
	boolean checkuser(String name);
	
	//添加用户账号信息
	boolean adduser(User user);
	
	//删除用户信息
	boolean deluser(String name);
}
