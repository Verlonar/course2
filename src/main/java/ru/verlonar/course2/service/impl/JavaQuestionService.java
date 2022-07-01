package ru.verlonar.course2.service.impl;

import org.springframework.stereotype.Service;
import ru.verlonar.course2.data.JavaQuestionRepository;
import ru.verlonar.course2.data.Question;
import ru.verlonar.course2.service.QuestionService;

import java.util.Collection;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService {

    private final Random random;
    private final JavaQuestionRepository questions;

    public JavaQuestionService(JavaQuestionRepository questions) {
        this.questions = questions;
        this.random = new Random();

    }

    @Override
    public Question add(String question, String answer) {
        Question questionToSet = new Question(question, answer);
        return add(questionToSet);
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        return questions.getAll().stream().toList().get(random.nextInt(questions.getAll().size()));
    }
}
