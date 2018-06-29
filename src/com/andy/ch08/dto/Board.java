package com.andy.ch08.dto;

import java.util.Date;

public class Board {
	int commentNo;
	String userId;
	Date regDate;
	String commentContent;
	
	public Board(int commentNo, String userId, Date regDate,
			String commentContent) {
		super();
		this.commentNo = commentNo;
		this.userId = userId;
		this.regDate = regDate;
		this.commentContent = commentContent;
	}
	public Board(String userId, String commentContent) {
		this(0,userId, null, commentContent);
	}
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	@Override
	public String toString() {
		return "Board [commentNo=" + commentNo + ", userId=" + userId
				+ ", regDate=" + regDate + ", commentContent=" + commentContent
				+ "]";
	}
	
}
