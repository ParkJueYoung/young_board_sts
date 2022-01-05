package com.board.model;

import java.util.Date;

public class BoardVO {

	// 게시판 번호
	private int bno;
	
	// 게시판 제목
	private String title;
	
	// 게시판 내용
	private String content;
	
	// 게시판 작가
	private String writer;
	
	// 게시글 등록일
	private Date regDate;
	
	// 게시판 수정일
	private Date updateDate;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDate="
				+ regDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
