package com.zensarspringbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class Details {
	@Id
	private int userId;
	private String userName;
	private String useremailId;
	private long userphonenumber;

	public Details() {
		super();
	}

	public Details(int userId, String userName, String useremailId, long userphonenumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.useremailId = useremailId;
		this.userphonenumber = userphonenumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUseremailId() {
		return useremailId;
	}

	public void setUseremailId(String useremailId) {
		this.useremailId = useremailId;
	}

	public long getUserphonenumber() {
		return userphonenumber;
	}

	public void setUserphonenumber(long userphonenumber) {
		this.userphonenumber = userphonenumber;
	}
	
}