package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Quiz;
import org.springframework.data.repository.CrudRepository;


public interface QuizRepository extends CrudRepository<Quiz, Long> {

}
