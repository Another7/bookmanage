package com.another.test;

public enum ColorEnum {
	RED("红色"), GREEN("绿色"), BLUE("蓝色");
	private String color;

	private ColorEnum(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
