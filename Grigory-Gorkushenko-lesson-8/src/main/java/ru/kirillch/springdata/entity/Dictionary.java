package ru.kirillch.springdata.entity;

import javax.persistence.*;

@Entity
public class Dictionary {

	@Id
	@GeneratedValue
	private Long id;

	private String word;
	private int repetition;
	private String transcription;
	private String translation;

	public Dictionary() {
	}

	public Dictionary(String word, int repetition, String transcription, String translation) {
		super();
		this.word = word;
		this.repetition = repetition;
		this.transcription = transcription;
		this.translation = translation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getRepetition() {
		return repetition;
	}

	public void setRepetition(int repetition) {
		this.repetition = repetition;
	}

	public String getTranscription() {
		return transcription;
	}

	public void setTranscription(String transcription) {
		this.transcription = transcription;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	@Override
	public String toString() {
		return "\nDictionary [id=" + id + ", word=" + word + ", repetition=" + repetition + ", transcription="
				+ transcription + ", translation=" + translation + "]";
	}

}