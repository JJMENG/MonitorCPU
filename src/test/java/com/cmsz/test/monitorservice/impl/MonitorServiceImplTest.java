package com.cmsz.test.monitorservice.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring.xml"})
public class MonitorServiceImplTest {
//添加git冲突，测试git提交
	@Autowired
	MonitorServiceImpl monitorCPU;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoService() throws Exception {
		monitorCPU.doService();
	}
    //	测试git的修改
	//17:21上传

}
