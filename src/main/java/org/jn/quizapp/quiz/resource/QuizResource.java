package org.jn.quizapp.quiz.resource;

import org.jn.quizapp.quiz.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuizResource {
	
	@Autowired
	private QuizRepository repository;
	
	@RequestMapping("/quiz")
	public @ResponseBody String getQuizzes() {
		return new String("Hello world from getQuizzes!");
	}
}
