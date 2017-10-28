package com.vladmeh.testTask.Repository;


import com.vladmeh.testTask.Entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
}
