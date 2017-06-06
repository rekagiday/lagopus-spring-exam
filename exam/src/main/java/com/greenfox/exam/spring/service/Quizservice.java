package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Response;
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
  Long[] randomIDs = setRandomIDs();

  private Long[] setRandomIDs() {

    Long[] randoms = new Long[5];

    for (int i = 1; i < 5; i++) {
      long rng = (long) (Math.random() * 10);
      randoms[0] = rng;
      while (randoms[i - 1] != rng) {
        randoms[i] = rng;
      }
    }
    return randoms;
  }

  public List<Question> addQuestions() {
    for (int i = 0; i < 5; i++) {
      questions.add(new Question(i + 1, quizRepository.findOne(randomIDs[i]).getQuestion()));
    }
    return questions;
  }


  public Response checkAnswers(List) {
    if (answers[i])


    }
    return answers;
  }


}
