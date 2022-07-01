package ru.verlonar.course2.service.constants;

import ru.verlonar.course2.data.Question;

import java.util.Set;

public class QuestionServiceConstants {

    public static final String QUESTION_QUESTION = "question 1";

    public static final String ANSWER = "answer 1";

    public static final Question QUESTION = new Question(QUESTION_QUESTION, ANSWER);
    public static final Question MATH_QUESTION = new Question("1", "1");

    public static final Set<Question> QUESTION_SET = Set.of(QUESTION);

}
