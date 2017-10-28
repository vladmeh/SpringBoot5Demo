package com.vladmeh.testTask.Controller;

import com.vladmeh.testTask.BookBuilder;
import com.vladmeh.testTask.Entity.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookControllerTest {
    private final List<Book> bookList = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
        bookList.add(
                new BookBuilder()
                        .id(1L)
                        .autor("Иван Портянкин")
                        .title("Swing. Эффектные пользовательские интерфейсы")
                        .description("Создание пользовательских интерфейсов Java-приложений с помощью библиотеки Swing и Java Foundation Classes")
                        .isbn("978-5-85582-305-9")
                        .printYear(2011)
                        .readAlready(false)
                        .build()
        );
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllBook() throws Exception {
    }

    @Test
    public void getPageBooks() throws Exception {
    }

    @Test
    public void findBookById() throws Exception {
    }

    @Test
    public void create() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

}