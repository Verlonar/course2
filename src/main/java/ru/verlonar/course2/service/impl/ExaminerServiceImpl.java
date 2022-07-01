package ru.verlonar.course2.service.impl;

import org.springframework.stereotype.Service;
import ru.verlonar.course2.data.Question;
import ru.verlonar.course2.exception.FewerValuesInTheCollectionThanRequestedException;
import ru.verlonar.course2.service.ExaminerService;
import ru.verlonar.course2.service.QuestionService;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final List<QuestionService> questionService;

    public ExaminerServiceImpl(QuestionService javaQuestionService, QuestionService mathQuestionService) {
        questionService = List.of(javaQuestionService, mathQuestionService);
    }

    @Override
    public Collection<Question> getQuestions(int amount) {

        //Если вопросы по математике генерируются "на лету", то зачем тогда проверка, вернуть же можно сколько угодно вопросов
//        if (amount > questionService.get(0).getAll().size()) {
//            throw new FewerValuesInTheCollectionThanRequestedException();
//        }
        Set<Question> questionList = new HashSet<>();
        while (questionList.size() < amount) {
            if (Math.random() * 2 > 1) {
                questionList.add(questionService.get(0).getRandomQuestion());
            } else {
                questionList.add(questionService.get(1).getRandomQuestion());
            }
        }
        return questionList;
    }
}
