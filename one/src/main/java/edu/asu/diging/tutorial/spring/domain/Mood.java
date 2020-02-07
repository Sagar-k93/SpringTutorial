package edu.asu.diging.tutorial.spring.domain;


import javax.annotation.PostConstruct;

public class Mood {

	private String feeling;
	
	@PostConstruct
	public void ConstructMood() {
	}

	public String getFeeling() {
		return feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}
	
	
}
