package ru.verlonar.course2.service.impl;

import org.springframework.stereotype.Service;
import ru.verlonar.course2.data.Question;
import ru.verlonar.course2.exception.CannotCallMathMethodsException;
import ru.verlonar.course2.service.QuestionService;

import java.util.Collection;
import java.util.Random;

@Service
public class MathQuestionService implements QuestionService {

    public Random random;

    public MathQuestionService() {
        this.random = new Random();
    }

    @Override
    public Question add(String question, String answer) {
        throw new CannotCallMathMethodsException();
    }

    @Override
    public Question add(Question question) {
        throw new CannotCallMathMethodsException();
    }

    @Override
    public Question remove(Question question) {
        throw new CannotCallMathMethodsException();
    }

    @Override
    public Collection<Question> getAll() {
        throw new CannotCallMathMethodsException();
    }

    @Override
    public Question getRandomQuestion() {
        return new Question(Integer.toString(random.nextInt(100)), Integer.toString(random.nextInt(100)));
    }
}
