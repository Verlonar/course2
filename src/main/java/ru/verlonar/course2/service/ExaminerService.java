package ru.verlonar.course2.service;

import ru.verlonar.course2.data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
