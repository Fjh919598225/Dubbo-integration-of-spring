package com.sxt.service;

import com.sxt.domain.UserAddress;

import java.util.List;

public interface UserService {
	
	/**
	 * 查询用户所有的地址
	 */
	public List<UserAddress> queryAllAddress(String userId);

}
