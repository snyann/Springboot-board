package com.mysite.answer;

import com.mysite.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}