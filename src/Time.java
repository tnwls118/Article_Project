import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

        public static String time(){
            Date now = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

            String formatnow = formatter.format(now);
            System.out.println(formatnow);
            return formatnow;
        }

}
