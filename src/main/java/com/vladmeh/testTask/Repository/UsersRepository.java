package com.vladmeh.testTask.Repository;

import com.vladmeh.testTask.Entity.Users;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersRepository extends BaseRepository<Users, Long> {
}
