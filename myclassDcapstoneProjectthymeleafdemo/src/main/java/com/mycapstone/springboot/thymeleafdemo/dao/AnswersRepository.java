package com.mycapstone.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycapstone.springboot.thymeleafdemo.entity.Answers;


public interface AnswersRepository extends JpaRepository<Answers, Integer> {

	public List<Answers> findByQuestionId(Integer questionId);
	
}
