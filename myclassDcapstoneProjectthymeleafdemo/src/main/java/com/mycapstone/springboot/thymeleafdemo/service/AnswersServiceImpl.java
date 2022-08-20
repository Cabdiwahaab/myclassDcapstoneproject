package com.mycapstone.springboot.thymeleafdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycapstone.springboot.thymeleafdemo.dao.AnswersRepository;
import com.mycapstone.springboot.thymeleafdemo.entity.Answers;

@Service
public class AnswersServiceImpl implements AnswersService {
	@Autowired
	private AnswersRepository repo;
	
	public Answers findByQuestionId(Integer questionId) {
		List<Answers> lstAns = repo.findByQuestionId(questionId);
		if(lstAns != null && lstAns.size() > 0) {
			return lstAns.get(0);
		}
		return null;
	}
}
