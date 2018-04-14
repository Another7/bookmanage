package com.another.domain;

public class Manager {
	private String id;
	private String password;
	private String name;
	private String tel;
	private boolean isOnline;

	public Manager() {

	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", password=" + password + ", name=" + name + ", tel=" + tel + ", isOnline="
				+ isOnline + "]";
	}

}
