package org.jn.quizapp.quiz;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<Quiz, String> {
	public List<Quiz> findAll();
	public Quiz findOne(String id);
}
