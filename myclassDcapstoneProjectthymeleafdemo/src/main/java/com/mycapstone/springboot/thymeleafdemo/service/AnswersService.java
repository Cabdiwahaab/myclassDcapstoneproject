package com.mycapstone.springboot.thymeleafdemo.service;

import com.mycapstone.springboot.thymeleafdemo.entity.Answers;

public interface AnswersService {
	Answers findByQuestionId(Integer questionId);
}
