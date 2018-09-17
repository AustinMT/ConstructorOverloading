import com.sun.xml.internal.txw2.IllegalAnnotationException;

public class TimeOfDay {

    private int myear;
    private int mDay;
    private int mMonth;
    private int mhour;
    private int mMinutes;


    public int getmYear() { return myear;}

    public int getmMonth() {
        return mMonth;
    }

    public int getMhour() {
        return mhour;
    }

    public int getmMinutes() {
        return mMinutes;
    }

    public int getmDay() {
        return mDay;
    }

    public TimeOfDay() {
        this(0,0,0,0, 0);

    }


    public TimeOfDay(int pHour) {
    }


    public TimeOfDay(int pYear, int pMonth, int pDay, int pHour, int pMinutes) {
        if (pMonth > 12 || pMonth < 0 || pHour > 23 || pHour < 0 || pMinutes > 59 || pMinutes < 0)
            throw new IllegalAnnotationException(
                    "Bad input of time: Hour:" + pHour + " Minutes " + pMinutes
                            + " " + TimeOfDay.class.getSimpleName());

        this.myear = pYear;
        this.mDay = pDay;
        this.mhour = pHour;
        this.mMinutes = pMinutes;
        this.mMonth = pMonth;


        if (pYear > 2019 || pYear < 0) {
            throw new IllegalArgumentException("Bad Year data input:" + pYear);
        }
        else
        {
            this.myear = pYear;
        }

        if (pMonth > 12 || pMonth < 0) {
            throw new IllegalArgumentException("Bad data input for month" + pMonth);
        } else {
            this.mMonth = pMonth;


        }
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

        if (pDay > 31 || pDay < 0) {
            throw new IllegalArgumentException("Bad data input" + pDay);
        }
        else {
            this.mDay = pDay;

            }
        }



    }



