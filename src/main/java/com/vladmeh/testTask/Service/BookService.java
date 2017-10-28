package com.vladmeh.testTask.Service;


import com.vladmeh.testTask.Entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void delete(Book book);
    Page<Book> findAllByPage(Pageable pageable);
}
