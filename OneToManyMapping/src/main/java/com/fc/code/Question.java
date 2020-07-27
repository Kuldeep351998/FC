package com.fc.code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Question 
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int questionId;
   
   private String question;
   
   @OneToMany
   @JoinTable(name = "answer_id")
   private Collection<Answer> answers;

public Question(int questionId, String question, Collection<Answer> answers) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answers = answers;
}

public Question() {
	super();
	// TODO Auto-generated constructor stub
}

public int getQuestionId() {
	return questionId;
}

public void setQuestionId(int questionId) {
	this.questionId = questionId;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public Collection<Answer> getAnswers() {
	return answers;
}

public void addAnswers(Answer answer) {
	if(answers==null)
	{
		answers=new ArrayList<Answer>();
	}
	if(!answers.contains(answer))
	{
		answers.add(answer);
	}
	
}
   
   

   
}
