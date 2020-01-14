package com.hdu.library.test;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hdu.library.service.impl.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserServiceImpl userService;
	
	@Test
	public void testCheck() {
		String name = "root";
		String pwd = "123";
		
		boolean f = userService.checkuser(name, pwd);
		Assert.assertThat(f, is(false));
	}
}
