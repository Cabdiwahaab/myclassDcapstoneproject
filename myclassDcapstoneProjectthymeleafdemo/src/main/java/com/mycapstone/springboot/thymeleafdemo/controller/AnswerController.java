package com.mycapstone.springboot.thymeleafdemo.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycapstone.springboot.thymeleafdemo.entity.Answers;
import com.mycapstone.springboot.thymeleafdemo.service.AnswersService;



@Controller
@RequestMapping("users")
public class AnswerController {
	// need to inject customerDao
	
	
	@Autowired
	private AnswersService answerService;
	
	
	
	@PostMapping("/findByQuestionId")
	public ResponseEntity<Answers> findByQuestionId(@RequestBody Map<String,Object> mapParam) {
		Integer questionId = Integer.parseInt(mapParam.get("questionId").toString());
		Answers ans = answerService.findByQuestionId(questionId);
		return ResponseEntity.ok(ans);
	}








}
