package com.file;

public class FileDTO {
	private String name;
	private String title;
	private String image;
	
	public FileDTO() {
		
	}
	
	public FileDTO(String name, String title, String image) {
		this.name = name;
		this.title = title;
		this.image = image;
	}
	

	
	//getter,setter
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public String getImage() {
		return image;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
