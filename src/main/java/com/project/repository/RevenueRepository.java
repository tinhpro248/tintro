package com.project.repository;

import com.project.dto.RevenueDTO;
import com.project.dto.RevenueListDTO;
import com.project.entity.Revenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RevenueRepository extends JpaRepository<Revenue, Integer> {
    @Query("select r.id as id, r.code as code, r.price as price, r.users.name as user, r.room.name as room, r.type as type, r.time as time" +
            " from Revenue r where r.users.id = :id order by time desc limit 2")
    List<RevenueListDTO> getList2Revenue(int id);

    @Query("select r.id as id, r.code as code, r.price as price, r.users.name as user, r.room.name as room, r.type as type, r.time as time" +
            " from Revenue r where r.users.id = :id order by time desc")
    List<RevenueListDTO> getListRevenue(int id);

    @Query("select r.id as id, r.code as code, r.price as price, r.users.name as user, r.room.name as room, r.type as type, r.groups as group" +
            " from Revenue r where r.id = :id")
    Optional<RevenueDTO> getRevenue(int id);
}
