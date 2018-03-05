package com.ing.gapp.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public abstract class DateUtil {

    public static Date LocalDateToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
