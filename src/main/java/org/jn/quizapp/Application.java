package org.jn.quizapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jn.quizapp.quiz.Quiz;
import org.jn.quizapp.quiz.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Application implements CommandLineRunner {

	@Autowired
	QuizRepository quizRepository;

	public void run(String... args) throws Exception {
		if(quizRepository.count() == 0) {
			System.out.println("Seeding the database..");
			Seeder.seed(quizRepository);
		}
		else {
			System.out.println("Data is present in the database.. Skip seeding.");
		}
	}
	
    public static void main(String[] args) {
    
        SpringApplication.run(Application.class, args);
    }
    
    static class Seeder {
    	public static void seed(QuizRepository quizRepository) {
    		Quiz quizOne = new Quiz("Miscellaneous", "What is name of my cat?", "cat.jpg", 
        			Arrays.asList("Bob", "Tom", "Alice"),
        			0
        			);
    		Quiz quizTwo = new Quiz("Miscellaneous", "What's in my pocket?", "pocket.jpg",
    				Arrays.asList("Candy", "Your Hand", "My Hand"),
    				2
    				);
        	quizRepository.save(quizOne);
        	quizRepository.save(quizTwo);
    	}
    }
    
}
