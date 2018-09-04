import com.sun.xml.internal.txw2.IllegalAnnotationException;

public class TimeOfDay {


    private int mhour;
    private int mMinutes;



    public int getMhour() {
        return mhour;
    }

    public int getmMinutes() {
        return mMinutes;
    }

    public TimeOfDay() {
        this(0, 0);

    }


    public TimeOfDay(int pHour) {
    }


    public TimeOfDay(int pHour, int pMinutes) {
        if (pHour > 23 || pHour < 0 || pMinutes > 59 || pMinutes < 0)
            throw new IllegalAnnotationException(
                    "Bad input of time: Hour:" + pHour + " Minutes " + pMinutes
                            + " " + TimeOfDay.class.getSimpleName());


        this.mhour = pHour;
        this.mMinutes = pMinutes;

        if (pHour > 23 || pHour < 0) {
            throw new IllegalArgumentException("Bad data Input: Hour " + pHour);


        } else {
            this.mhour = pHour;

        }
        if (pMinutes > 59 || pMinutes < 0) {
            throw new IllegalArgumentException("Bad data Input: Minutes " + pMinutes);


        } else {
            this.mMinutes = pMinutes;
        }

    }
}