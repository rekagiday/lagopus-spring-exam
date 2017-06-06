package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Response;
import com.greenfox.exam.spring.repository.QuizRepository;
import com.greenfox.exam.spring.service.QuizService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRestController {

  @Autowired
  QuizRepository quizRepository;

  @Autowired
  QuizService quizService;

  @GetMapping(value = "/questions")
  public List<Question> listQuestions() {
    return quizService.addQuestions();
  }

  @PostMapping(value = "/answers")
  public Response response(@RequestBody Answer[] answers) {
    return quizService.checkAnswers(answers);
  }

}
