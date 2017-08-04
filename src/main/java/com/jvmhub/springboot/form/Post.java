package com.jvmhub.springboot.form;

import javax.validation.constraints.Size;

public class Post {
	

	private String content;
    private String title;

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
}
