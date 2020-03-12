package support.convert.dates;

import intern.Instances;

import java.util.Calendar;
import java.util.Date;

public class Adder {
    public Date days(int amount){
        Date date = Instances.getDateInstance();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, amount);
        return c.getTime();
    }

    public Date mins(int amount){
        Date date = Instances.getDateInstance();
        long curTimeInMs = date.getTime();
        return new Date(curTimeInMs + (amount * 60000));
    }
}
