package com.qf.dao;

import com.qf.entity.User;

public interface IUserDao extends IBaseDao<User> {
	
	public User login(String name, String password);
}
