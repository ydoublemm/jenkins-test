package com.ymm.jenkinstest;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ymm
 * @Date: 2019-05-11 10:35 
 * @Description:
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello(){
		return "jenkins测试冲突";
	}
}
