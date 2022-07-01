package ru.verlonar.course2.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionService javaQuestionService;

    @Mock
    private MathQuestionService mathQuestionService;

    @InjectMocks
    static ExaminerServiceImpl out;

    //как можно нормально протестировать методы, которые работают на рандоме?
    @Test
    void getQuestions() {
        assertNotNull(out.getQuestions(1));
    }
}