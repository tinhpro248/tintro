package com.project.service;

import com.project.dto.NotificationDTO;
import com.project.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoService {

    @Autowired
    NotificationRepository notificationRepository;

    public NotificationDTO getNotification(int id) {
        return notificationRepository.getAll(id).get(0);
    }

    public List<NotificationDTO> getAllNotify(int id){
        return notificationRepository.getAll(id);
    }


}
