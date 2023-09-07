package com.etc.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {

	private String userName;

	private String passWord;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
