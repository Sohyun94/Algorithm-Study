package com.ssafy.ws09.step2;

public class TitleNotFoundException extends Error {
	private String title;

	TitleNotFoundException(String title) {

	}

	public String getTitle() {
		return title;
	}

}
