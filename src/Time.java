import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    long start;
    long finish;
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

    public void nowTime(){
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    public void startTime(){
        Calendar calendarStart = Calendar.getInstance();
        start = calendarStart.getTimeInMillis();
    }

    public void finishTime(){
        Calendar calendarFinish = Calendar.getInstance();
        finish = calendarFinish.getTimeInMillis();
        System.out.println("Прохождение заняло: " + (finish - start)/1000 + " секунд");
    }

}
