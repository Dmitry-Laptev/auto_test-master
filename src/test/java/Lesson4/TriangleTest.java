package Lesson4;

import org.example.lesson4.AppTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    static Logger logger = LoggerFactory.getLogger(AppTest.class);


    Integer repeated = 1;

    @Test
    @Disabled("Для демонстрации")
    @Order(1)

    public void simpleTest() {
        logger.info("Инфо");
        logger.error("ошибка");
        assertTrue( true );
    }

    @Test
    @DisplayName("Простой тест")
    @Tag("tagTest")
    public void simpleDisableTest()
    {

        assertTrue( true );
    }

    @Test
    @RepeatedTest(10)
    @Tag("tagTest")
    public void repeatedTest()
    {
        repeated++;
        System.out.println("Тестовая строка, номер: " + repeated);
        assertTrue( true );
    }

    @ParameterizedTest
    @ValueSource(strings = { "word1", "word2", "word3" })
    @Tag("tagTest")
    public void isParameterizedTest(String word){
        System.out.println(word);
    }

}
