public class TimeOfDay {


    private int mhour;
    private int mMinutes;
    private int hourcheck;
    private int minutecheck;

    public TimeOfDay() {
        this(0,0);
    }


    public int getHourcheck(int pHour) {
        return hourcheck;
       if (23 < pHour) {
           System.out.println("That number is to large");

       if (23 > pHour) {
           System.out.println();

       }

       if (59 < mMinutes) {

           
       }
    }



    public int getMinutecheck() {
        return minutecheck;
    }



    public TimeOfDay(int pHour) {
        this( pHour, 0);
    }

    public TimeOfDay(int phour, int pMinutes) {
        this.mhour = phour;
        this.mMinutes = pMinutes;
    }


    public int getMhour() {
        return mhour;
    }

    public int getmMinutes() {
        return mMinutes;
    }

}
