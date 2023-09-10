package article;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    public static String getTime() {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        return formatter.format(now);
    }
}
