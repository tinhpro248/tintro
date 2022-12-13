package com.project.repository;

import com.project.dto.BillDTO;
import com.project.dto.BillListDTO;
import com.project.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BillRepository extends JpaRepository<Bill, Integer> {
    @Query("select r.id as id, r.code as code, r.price as price, r.startTime as startTime, r.room.name as room, r.type as type, r.endTime as endTime" +
            " from Bill r where r.room.users.id = :id order by startTime desc limit 2")
    List<BillListDTO> getList2Bill(int id);

    @Query("select r.id as id, r.code as code, r.price as price, r.startTime as startTime, r.room.name as room, r.type as type, r.endTime as endTime" +
            " from Bill r where r.room.users.id = :id order by startTime desc")
    List<BillListDTO> getListBill(int id);

    @Query("select r.id as id, r.code as code, r.price as price, r.startTime as startTime, r.room.name as room, r.type as type, r.endTime as endTime" +
            ", r.note as note from Bill r where r.id = :id")
    Optional<BillDTO> getBill(int id);
}
