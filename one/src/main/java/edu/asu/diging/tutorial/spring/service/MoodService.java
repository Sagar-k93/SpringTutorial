package edu.asu.diging.tutorial.spring.service;

import edu.asu.diging.tutorial.spring.domain.Mood;

public interface MoodService {

	Mood getCurrentMood();

	String getMoodReason();

}