package com.hdu.library.controller;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
			return ResponseResult.build(201, "登陆失败");
		}
	}
	
	@PostMapping("/user/register")
	public ResponseResult register(String name, String pwd, int status) {
		if(userService.checkuser(name)) {
			return ResponseResult.build(201, "用户名已存在");
		}else {
			User user = new User();
			user.setuName(name);
			user.setuPwd(pwd);
			user.setuStatus(status);
			boolean b = userService.adduser(user);
			if (b) {
				return ResponseResult.build(200, "新建成功");
			}else {
				return ResponseResult.build(201, "新建失败");
			}
		}
	}
	
	@GetMapping("/user/delete")
	public ResponseResult delete(String name) {
		if(!userService.checkuser(name)) {
			return ResponseResult.build(201, "用户名不存在");
		}else {
			boolean b = userService.deluser(name);
			if (b) {
				return ResponseResult.build(200, "删除成功");
			}else {
				return ResponseResult.build(201, "删除失败");
			}
		}
	}
	
	@GetMapping("/user/select")
	public ResponseResult select(String name) {
		if (!userService.checkuser(name)) {
			return ResponseResult.build(201, "用户不存在");
		}else {
			User user = userMapper.selectByName(name);
			return ResponseResult.build(200, "用户存在", user);
		}
	}
}
