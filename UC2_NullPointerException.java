package com.bridgelab.moodanlyzer;

public class Uc2MoodAnalyser {
	public String analyseMood(String message) {
		try {
			if (message.contains("Sad")) {
				return "SAD";
			}
		} catch (NullPointerException ex) {
			return "HAPPY";
		}
		return null;
	}

}