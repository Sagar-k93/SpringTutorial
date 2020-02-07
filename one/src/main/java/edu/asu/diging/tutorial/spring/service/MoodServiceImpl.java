package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodServiceImpl implements MoodService {

	private List<String> feelings;
	private String currentFeeling;
	private Map<String,String> moodReasons;
	
	@Override
	public Mood getCurrentMood() {
		feelings = new ArrayList<>();
		Mood currentMood = new Mood();
		feelings.addAll(Arrays.asList(new String[]{"Happy","Sad","Excited","Joyful"}));
		int randomInt = (new Random()).nextInt(4);
		currentFeeling = feelings.get(randomInt);
		currentMood.setFeeling(currentFeeling);
		return currentMood;
	}
	
	@Override
	public String getMoodReason() {
		LoadReasons();
		return moodReasons.get(currentFeeling);
	}
	
	private void LoadReasons() {
		moodReasons = new HashMap<>();
		moodReasons.put("Happy","Tomcat is happy because it is having a good day.");
		moodReasons.put("Sad","Tomcat is sad because it has no food.");
		moodReasons.put("Excited","Tomcat is excited because it got a job.");
		moodReasons.put("Joyful","Tomcat is joyful because it is happy.");
	}

}
