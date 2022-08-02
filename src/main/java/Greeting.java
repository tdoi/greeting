import java.util.Calendar;

public class Greeting {

    public static interface Clock {
        int getHour();
    }

    private static class DefaultClock implements Clock {
        public int getHour() {
            return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        }
    }

    Clock clock = new DefaultClock();

    public String greet() {
        int hour = clock.getHour();
        if (5 <= hour && hour <= 9) {
            return "Good Morning";
        } else if (10 <= hour && hour <= 16) {
            return "Hello";
        } else {
            return "Good Evening";
        }
    }

}
