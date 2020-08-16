package LevelOne;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LevelOne {
    public long count(String numberStart, String numberEnd) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(numberStart);
        Date date2 = format.parse(numberEnd);
        long difference = date2.getTime() - date1.getTime();
        return difference / 1000;
    }
}
