package com.cn.neighbors.login.biz.impl;


import com.cn.neighbors.login.biz.Test2;
import com.cn.neighbors.login.dao.TestMapper;
import com.cn.neighbors.login.entity.TtWaybill;

public class Test2Impl implements Test2 {
	TestMapper mapper;

	public TtWaybill getIDName(String id) {
		// TODO Auto-generated method stub
		return mapper.getIDName(id);
	}

	public TestMapper getMapper() {
		return mapper;
	}

	public void setMapper(TestMapper mapper) {
		this.mapper = mapper;
	}

}
