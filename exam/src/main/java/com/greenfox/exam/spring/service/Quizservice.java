package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuizRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

  @Autowired
  private QuizRepository quizRepository;

  List<Question> questions;
  List<Answer> answers;
  long[] randomIDs = new long[5];

  public List<Question> addQuestions() {

    for (int i = 1; i < 5; i++) {
      long rng = (long) (Math.random() * 10);
      randomIDs[0] = rng;
      while (randomIDs[i - 1] != rng) {
        randomIDs[i] = rng;
      }
    }

    for (int i = 0; i < 5; i++) {
      questions.add(new Question(quizRepository.findOne(randomIDs[i]).getQuestion()));
    }
    return questions;
  }




}
