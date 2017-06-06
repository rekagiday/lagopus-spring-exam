package com.greenfox.exam.spring.model;

import com.greenfox.exam.spring.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by User on 2017. 06. 06..
 */
public class Answer {

  @Autowired
  QuizRepository quizRepository;

  long id;
  String answerText;

  public Answer(long id, String answerText) {
    this.id = quizRepository.findOne(id).getId();
    this.answerText = answerText;
  }

  public Answer() {
  }

  public String getAnswerText() {
    return answerText;
  }
}
