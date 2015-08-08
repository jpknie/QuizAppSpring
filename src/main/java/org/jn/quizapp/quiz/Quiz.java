package org.jn.quizapp.quiz;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Quiz {
	@Id
	public long id;
	public String question;
	public String imageRef;
	public List<String> choices;
	public int correctAnswer;	

	public Quiz() {
		
	}

	public Quiz(long id, String question, String imageRef, List<String> choices, int correctAnswer) {
		this.id = id;
		this.question = question;
		this.imageRef = imageRef;
		this.choices = choices;
		this.correctAnswer = correctAnswer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getImageRef() {
		return imageRef;
	}

	public void setImageRef(String imageRef) {
		this.imageRef = imageRef;
	}

	public List<String> getChoices() {
		return choices;
	}

	public void setChoices(List<String> choices) {
		this.choices = choices;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
}
