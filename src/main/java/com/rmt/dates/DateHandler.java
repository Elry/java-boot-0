package com.rmt.dates;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;

public class DateHandler {
    public Date dateNow(){
      Date newDT = new Date();
      return newDT;
    }

    public Calendar calendarNow(){
        Calendar cl = Calendar.getInstance();
        return cl;
    }

    public LocalDate today(){
        LocalDate today = LocalDate.now();
        return today;
    }

    public LocalDate yesterday(){
        LocalDate yesterday = today().minusDays(1);
        return yesterday;
    }
}