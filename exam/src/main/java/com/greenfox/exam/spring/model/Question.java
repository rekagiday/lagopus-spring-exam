package com.greenfox.exam.spring.model;

import java.util.List;

/**
 * Created by User on 2017. 06. 06..
 */
public class Question {

  String questionText;

  public Question(String questionText) {
    this.questionText = questionText;
  }

  public Question() {
  }

  public String getQuestionText() {
    return questionText;
  }
}
