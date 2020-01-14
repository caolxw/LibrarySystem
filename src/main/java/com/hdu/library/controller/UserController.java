package com.hdu.library.controller;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdu.library.entry.User;
import com.hdu.library.mapper.UserMapper;
import com.hdu.library.service.UserService;
import com.hdu.library.util.ResponseResult;

@RestController
public class UserController {
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	@Autowired
	UserMapper userMapper;
	
	@PostMapping("/login")
	public ResponseResult login(String name, String pwd) {
		if (userService.checkuser(name, pwd)) {
			User user = userMapper.selectByName(name);
			return ResponseResult.build(200, "登陆成功", user);
		}else {
			return ResponseResult.build(200, "登陆失败");
		}
	}
}
