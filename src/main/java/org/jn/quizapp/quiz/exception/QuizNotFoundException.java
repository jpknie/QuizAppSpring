package org.jn.quizapp.quiz.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such quiz!")
public class QuizNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;	
}
