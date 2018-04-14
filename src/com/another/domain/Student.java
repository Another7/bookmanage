package com.another.domain;

public class Student {
	private String id;
	private String name;
	private String password;
	private String pictureUri;
	private char sex;
	private String school;
	private String profession;
	private String isOnline;

	public Student() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPictureUri() {
		return pictureUri;
	}

	public void setPictureUri(String pictureUri) {
		this.pictureUri = pictureUri;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", pictureUri=" + pictureUri
				+ ", sex=" + sex + ", school=" + school + ", profession=" + profession + ", isOnline=" + isOnline + "]";
	}

}
