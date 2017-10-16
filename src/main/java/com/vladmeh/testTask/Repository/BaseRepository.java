package com.vladmeh.testTask.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID>{

    void delete(T entity);

    List<T> findAll();

    T findOne(ID id);

    <S extends T> S save(S entity);

    Iterable<T> findAll(Sort sort);

    Page<T> findAll(Pageable pageable);
}
