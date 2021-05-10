package com.member.util;

public class PageUtil {
	private int totPage;
	private int blockPage;
	private int startPage;
	private int endPage;
	private int currentPage;
	private String field;
	private String word;
	
	//getter, setter
	public int getTotPage() {
		return totPage;
	}
	public int getBlockPage() {
		return blockPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setTotPage(int totPage) {
		this.totPage = totPage;
	}
	public void setBlockPage(int blockPage) {
		this.blockPage = blockPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String getField() {
		return field;
	}
	public String getWord() {
		return word;
	}
	public void setField(String field) {
		this.field = field;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	

}

