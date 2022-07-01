package ru.verlonar.course2.service.impl;


import org.junit.jupiter.api.Test;
import ru.verlonar.course2.exception.CannotCallMathMethodsException;

import static org.junit.jupiter.api.Assertions.*;
import static ru.verlonar.course2.service.constants.QuestionServiceConstants.*;

class MathQuestionServiceTest {

    static MathQuestionService out = new MathQuestionService();

    @Test
    void add() {
        assertThrows(CannotCallMathMethodsException.class, () -> out.add(QUESTION_QUESTION, ANSWER));
    }

    @Test
    void testAdd() {
        assertThrows(CannotCallMathMethodsException.class, () -> out.add(QUESTION));
    }

    @Test
    void remove() {
        assertThrows(CannotCallMathMethodsException.class, () -> out.remove(QUESTION));
    }

    @Test
    void getAll() {
        assertThrows(CannotCallMathMethodsException.class, () -> out.getAll());
    }

    //как можно нормально протестировать методы, которые работают на рандоме?
    @Test
    void getRandomQuestion() {
        assertNotNull(out.getRandomQuestion());
    }
}