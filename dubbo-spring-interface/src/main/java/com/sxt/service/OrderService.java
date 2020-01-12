package com.sxt.service;

import com.sxt.domain.UserAddress;

import java.util.List;

public interface OrderService {
	
	public List<UserAddress> initOrder(String userId);

}

