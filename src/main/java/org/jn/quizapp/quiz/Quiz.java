package org.jn.quizapp.quiz;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Quiz {
	@Id
	public String id;
	public String category;
	public String question;
	public String imageRef;
	public List<String> choices;
	public int correctAnswer;	

	public Quiz() {
		
	}

	public Quiz(String category, String question, String imageRef, List<String> choices, int correctAnswer) {
		this.category = category;
		this.question = question;
		this.imageRef = imageRef;
		this.choices = choices;
		this.correctAnswer = correctAnswer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
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
