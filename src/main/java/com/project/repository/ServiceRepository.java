package com.project.repository;

import com.project.dto.ServiceListDTO;
import com.project.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
    @Query("select s.id as id, s.name as name, s.price as price, s.type as type from Service s where s.users.id = :id")
    List<ServiceListDTO> getListService(int id);

}
