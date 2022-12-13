package com.project.repository;

import com.project.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface InfoRepository extends JpaRepository<Info, Integer> {
    @Query("select i from Info i where i.users.id = :id")
    Optional<Info> getIn(int id);
}
