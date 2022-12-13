package com.project.dto;

import java.util.Date;

public interface BillListDTO {
    int getId();
    String getCode();
    int getType();
    int getPrice();
    String getRoom();
    Date getStartTime();
    Date getEndTime();

}
