package com.mycapstone.springboot.thymeleafdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mycapstone.springboot.thymeleafdemo.dao.AnswersRepository;
import com.mycapstone.springboot.thymeleafdemo.entity.Answers;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ThymeleafdemoApplicationTests {

	@Autowired
	AnswersRepository answerRepo;
	
	
	@Test
	public void validateById() {
		
		
		Answers use = answerRepo.findById(2).get();
		Assertions.assertEquals("B", use.getAnswers());

	}
	
	
	@Test
	public void validateFirstName() {
		
		
		Answers user = answerRepo.findById(1).get();
		Assertions.assertEquals("C", user.getAnswers());
		
		
	}

	@Test
	public void checkReposityClass() {
		
		
	
		Assertions.assertNotNull(answerRepo);
		
		
	}
}

