package ru.site.score2;

import java.util.Date;

public class Score {

	private String firstName;
	private String lastName;
	private int score;
	private Date playDate;
	
	public Score(String firstName, String lastName, int score, Date playDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
		this.playDate = playDate;
	}

	@Override
	public String toString() {
		return "Score [firstName=" + firstName + ", lastName=" + lastName + ", score=" + score + ", playDate="
				+ playDate + "]";
	}

	
	
}
