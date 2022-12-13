package com.project.dto;

import java.util.Date;

public interface NotificationDTO {
    public int getId();
    public String getContent();
    public Date getTime();
    public int getType();
}
