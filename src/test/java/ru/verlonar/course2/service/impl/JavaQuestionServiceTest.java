package ru.verlonar.course2.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.verlonar.course2.data.JavaQuestionRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static ru.verlonar.course2.service.constants.QuestionServiceConstants.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {

    private JavaQuestionRepository repositoryMock;

    static JavaQuestionService out;

    @BeforeEach
    void setup() {
        repositoryMock = Mockito.mock(JavaQuestionRepository.class);
        out = new JavaQuestionService(repositoryMock);
    }

    @Test
    void add() {
        when(repositoryMock.add(QUESTION))
                .thenReturn(QUESTION);

        assertEquals(QUESTION, out.add(QUESTION_QUESTION, ANSWER));
    }

    @Test
    void testAdd() {
        when(repositoryMock.add(QUESTION))
                .thenReturn(QUESTION);

        assertEquals(QUESTION, out.add(QUESTION));
    }

    @Test
    void remove() {
        when(repositoryMock.remove(QUESTION))
                .thenReturn(QUESTION);

        assertEquals(QUESTION, out.remove(QUESTION));
    }

    @Test
    void getAll() {
        when(repositoryMock.getAll())
                .thenReturn(QUESTION_SET);

        assertIterableEquals(QUESTION_SET, out.getAll());
    }

    @Test
    void getRandomQuestion() {
        when(repositoryMock.getAll())
                .thenReturn(QUESTION_SET);

        assertEquals(QUESTION, out.getRandomQuestion());
    }
}