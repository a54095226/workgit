package cn.pro.action;


import com.opensymphony.xwork2.ActionSupport;

import cn.pro.model.User;

public class UserAction extends ActionSupport {
	
	private User user;    //�ڶ��ִ��ݲ����ķ���
	
	public String add()
	
	{   System.out.println("ִ�е�һ��action");
		System.out.println(user.getName());
		System.out.println(user.getPass());
		System.out.println(user.getPass());
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
