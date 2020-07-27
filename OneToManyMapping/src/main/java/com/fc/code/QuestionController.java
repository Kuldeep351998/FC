package com.fc.code;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/que")
public class QuestionController 
{

	@Autowired
	QuestionRepository repo;
	
	@Autowired
	AnswerRepository repo1;
	
@GetMapping("/save")
public String save()
 {
    Answer as=new Answer();
    as.setAnswer("Hii");
    
    Answer as2=new Answer();
    as2.setAnswer("Hii1");
    
    Answer as1=new Answer();
    as1.setAnswer("Hellow");
    
    
    Question q=new Question();
    q.setQuestion("Start with ?...");
    q.addAnswers(as);
    q.addAnswers(as1);
    q.addAnswers(as2);
    repo.save(q);
    return "Record Save Successfully";
 }
}
