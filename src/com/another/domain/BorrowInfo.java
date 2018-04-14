package com.another.domain;

import java.sql.Date;

public class BorrowInfo {
	private String studentid;
	private String bookISBN;
	private String studentName;
	private String bookName;
	private Date borrowDate;
	private Date backDate;
	private boolean isBack;

	public BorrowInfo() {

	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getBackDate() {
		return backDate;
	}

	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}

	public boolean isBack() {
		return isBack;
	}

	public void setBack(Boolean isBack) {
		this.isBack = isBack;
	}

	@Override
	public String toString() {
		return "BorrowInfo [studentid=" + studentid + ", bookISBN=" + bookISBN + ", borrowDate=" + borrowDate
				+ ", backDate=" + backDate + ", isBack=" + isBack + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBack(boolean isBack) {
		this.isBack = isBack;
	}

}
