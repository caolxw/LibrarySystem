package com.hdu.library.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hdu.library.entry.User;
import com.hdu.library.service.impl.UserServiceImpl;

public class UserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckuser() {
		String name = "root";
		String pwd = "root";
		
		UserServiceImpl uServiceImpl = new UserServiceImpl();
		assertEquals(0, uServiceImpl.checkuser(name, pwd));
	}

}
