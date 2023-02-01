package com.appystack.ipd.operationtheater;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Temp {
    public static void main(String[] args) throws ParseException {
        String firstDate = "16/12/2022";
        String firstTime = "09:00 AM";
        String secondDate = "17/12/2022";
        String secondTime = "08:59 AM";

        String format = "dd/MM/yyyy hh:mm a";

        SimpleDateFormat sdf = new SimpleDateFormat(format);

        Date dateObj1 = sdf.parse(firstDate + " " + firstTime);
        Date dateObj2 = sdf.parse(secondDate + " " + secondTime);
        System.out.println("Date Start: "+dateObj1);
        System.out.println("Date End: "+dateObj2);

        Date dayAfter = new Date(dateObj2.getTime() + TimeUnit.DAYS.toMillis( 1 ));//increment day by 1
        System.out.println("NextDay: "+dayAfter);
        long dif = dateObj1.getTime();
        while (dif < dateObj2.getTime()) {
            Date slot = new Date(dif);
            DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
            System.out.println(dateFormat.format(slot));
            Date today = Calendar.getInstance().getTime();
            System.out.println("Hour Slot --->" + slot);
            SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
            System.out.println(sdf1.format(slot));
            dif += 900000;
        }
    }
}
