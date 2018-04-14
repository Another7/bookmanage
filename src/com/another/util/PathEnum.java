package com.another.util;

public enum PathEnum {
	STUDENTVIEW("/jsp/studentview/"),MANAGERVIEW("/jsp/managerview/"),OTHER("/jsp/other/");
	private String path;

	private PathEnum(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
