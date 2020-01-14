package com.hdu.library.test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
 * 测试通用类
 * Date 2020/1/14
 * Create By Cao
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Before
	public void init() {
		System.out.println("---开始测试---");
	}
	
	@After
	public void after() {
		System.out.println("---结束测试---");
	}
}
