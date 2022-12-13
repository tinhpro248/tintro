package com.project.dto;

import java.util.Date;

public interface IncidentListDTO {
    int getId();
    String getRoom();
    String getType();
    Date getTime();
    Byte[] getImage();
}
