package com.project.controller;

import com.project.dto.NotificationDTO;
import com.project.service.NoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class NoController {

    @Autowired
    NoService noService;
    @GetMapping("notification")
    public NotificationDTO notification(@Param("id") int id){
        return noService.getNotification(id);
    }

    @GetMapping("notification/list")
    public List<NotificationDTO> notificationList(@Param("id") int id){
        return noService.getAllNotify(id);
    }


}
