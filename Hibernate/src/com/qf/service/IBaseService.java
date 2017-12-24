package com.qf.service;

import com.qf.entity.Page;

public interface IBaseService<T> {

	public int add(T t);
	
	public int update(T t);
	

	public int delete(Integer id);
	
	public void getList(Page page);
	
	
	public T getById(Integer id);
}
