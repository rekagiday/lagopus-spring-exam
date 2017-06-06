package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Response;
import com.greenfox.exam.spring.repository.QuizRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class QuizService {


  @Autowired
  private QuizRepository quizRepository;

  private List<Question> questions;
  private List<Answer> answers;
  private Long[] randomIDs = setRandomIDs();

  private Long[] setRandomIDs() {
    List<Long> randoms = new ArrayList<>();
    for (long i = 1; i <= 10; i++) {
      randoms.add(i);
    }
    Collections.shuffle(randoms);
    for (int i = 0; i < 5; i++) {
      randomIDs[i] = randoms.get(i);
    }
    return randomIDs;
  }

  public List<Question> addQuestions() {
    for (int i = 0; i < 5; i++) {
      questions.add(new Question(i + 1, quizRepository.findOne(randomIDs[i]).getQuestion()));
    }
    return questions;
  }


  public Response checkAnswers(Answer[] answers) {
    int counter = 1;
    while (counter < 6 && answers[counter].toString()
        .equals(quizRepository.findOne(randomIDs[counter]).getAnswer())) {
      counter++;
    }
    return new Response();
  }
}
