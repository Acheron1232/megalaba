package com.acheron.megalaba.lessons.entity.repository;

import com.acheron.megalaba.lessons.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Lesson, Long> {
}
