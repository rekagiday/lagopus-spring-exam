package com.greenfox.exam.spring.model;

import com.greenfox.exam.spring.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 2017. 06. 06..
 */
public class Question {

  @Autowired
  QuizRepository quizRepository;


  private long id;

  private String questionText;

  public Question() {
  }

  public Question(long id, String questionText) {
    this.id = quizRepository.findOne(id).getId();
    this.questionText = questionText;
  }

  public String getQuestionText() {
    return questionText;
  }
}
