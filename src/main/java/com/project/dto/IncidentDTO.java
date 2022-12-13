package com.project.dto;

import java.util.Date;

public interface IncidentDTO {
    int getId();
    String getRoom();
    String getType();
    Date getTime();
    String getNote();
    Byte[] getImage();
    int getStatus();
}
