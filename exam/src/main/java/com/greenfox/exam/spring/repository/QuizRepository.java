package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Quiz;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by User on 2017. 06. 06..
 */
public interface QuizRepository extends CrudRepository<Quiz, Long> {

}
