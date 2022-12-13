package com.project.repository;

import com.project.dto.IncidentDTO;
import com.project.dto.IncidentListDTO;
import com.project.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IncidentRepository extends JpaRepository<Incident, Integer> {
    @Query("select i.id as id, i.room.name as room, i.type as type, i.time as time, i.image as image from " +
            "Incident i where i.room.users.id = :id order by time desc")
    List<IncidentListDTO> getListIncident(int id);

    @Query("select i.id as id, i.room.name as room, i.type as type, i.time as time, i.image as image from " +
            "Incident i where i.room.id = :id order by time desc")
    List<IncidentListDTO> getListIncidentTenant(int id);

    @Query("select i.id as id, i.room.name as room, i.type as type, i.time as time, i.image as image, i.status as status, i.note as note from " +
            "Incident i where i.id = :id")
    Optional<IncidentDTO> getIncident(int id);
}
