package com.cn.neighbors.login.action;

import com.cn.neighbors.login.biz.Test2;
import com.cn.neighbors.login.entity.TtWaybill;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -692156925241048478L;
	private Test2 test2;
	/**
	 * jsp的id
	 */
	private String id;
	/**
	 * 查询返回的entity
	 */
	private TtWaybill ttWaybill;

	public String search() throws Exception {
		// TODO Auto-generated method stub
		ttWaybill = test2.getIDName(id);
		return SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTest2(Test2 test2) {
		this.test2 = test2;
	}

	public TtWaybill getTtWaybill() {
		return ttWaybill;
	}

	public void setTtWaybill(TtWaybill ttWaybill) {
		this.ttWaybill = ttWaybill;
	}

}
