import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Sample6b {
    public static void main(String[] args) {
        //①
        Date now = new Date();

        Calendar calendar = Calendar.getInstance();

        //②
        calendar.setTime(now);

        //③
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        //④
        day += 100;
        calendar.set(Calendar.DAY_OF_MONTH, day);

        //⑤
        Date future = calendar.getTime();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");

        System.out.println(simpleDateFormat.format(future));
    }
}
