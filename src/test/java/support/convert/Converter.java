package support.convert;

import intern.Instances;
import support.convert.dates.Datter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Converter {

    public int toInt(Object valor){
        int i = 0;
        try{
            i = Integer.parseInt(valor.toString().replaceAll("[^0-9]", ""));
        }catch (NumberFormatException e){
            throw new NullPointerException(Instances.getMessageNumberTooLong());
        }
        return i;
    }

    public List<Object> stringToList(String text){
        StringBuilder sb = new StringBuilder(text);
        if(text.startsWith("[")){
            sb.replace(0, 1, "").reverse().replace(0, 1, "").reverse();
        }
        String[] arr = sb.toString().split(",");
        return Arrays.asList(arr);
    }

    public long toLong(Object valor){
        return Long.parseLong(valor.toString().replaceAll("[^0-9]", ""));
    }

    public String toString(Object valor){
        return valor.toString();
    }

    public Date toDate(String data){
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Instances.setDateInstance(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public Datter date(Date date){
        return Instances.getDatterClass();
    }

}
