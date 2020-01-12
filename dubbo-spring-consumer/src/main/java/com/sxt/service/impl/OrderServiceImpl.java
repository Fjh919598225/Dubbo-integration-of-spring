package com.sxt.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.sxt.domain.UserAddress;
import com.sxt.service.OrderService;
import com.sxt.service.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

	@Reference
	private UserService userService; //<!-- 生成远程调用对象 -->  注解注入
	
//	public void setUserService(UserService userService) { xml注入
//		this.userService = userService;
//	}

	@Override
	public List<UserAddress> initOrder(String userId) {
		return userService.queryAllAddress(userId);
	}

}
