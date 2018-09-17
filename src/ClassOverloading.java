import java.util.Scanner;


public class ClassOverloading {
    private TimeOfDay now;
    private TimeOfDay then;
    int hourDifference;
    int minDifference;
    int monthDifference;
    int dayDifference;


    public static void main(String[] args) {
        ClassOverloading classoverloading = new ClassOverloading();
        classoverloading.init();


    }

    public void init() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a Month, then hours and minutes");
        now = setTimeOfDay(keyboard, now);
        System.out.println("\nSet your second: Enter a Month, then hours and minutes\n");
        then = setTimeOfDay(keyboard, then);
        System.out.println("First Set of Month & hours & minutes = " + now.getmMonth() + "/" +
                now.getmDay() + "/" +
                now.getMhour() + ":" +
                now.getmMinutes());

        System.out.println("Second Set of hours & minutes = " +
                then.getmMonth() + "/" +
                now.getmDay() + "/" +
                then.getMhour() + ":" +
                then.getmMinutes());

        if (time(now, then)) {
            System.out.println("\n The time difference is " + monthDifference + "/" + dayDifference + "/" +hourDifference + ":" + minDifference);
        } else {
            System.out.println("You gave the same times");
        }


    }

    public TimeOfDay setTimeOfDay(Scanner pkeyboard, TimeOfDay now) {
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter In the month #");
            int pMonth = pkeyboard.nextInt();
            System.out.println("Enter In the day of the month");
            int pDay = pkeyboard.nextInt();
            System.out.println("Enter The Hour");
            int pHours = pkeyboard.nextInt();
            System.out.println("Enter The Minutes");
            int pMinutes = pkeyboard.nextInt();
            if (validhours(pHours) && validminutes(pMinutes) && validmonth((pMonth)) && validDay(pDay)) {
                now = new TimeOfDay(pMonth, pDay, pHours, pMinutes);
                valid = true;
                return now;
            } else {
                System.out.println("You have entered an invalid time:" + pMonth + "/" + pDay + "/" + pHours + ":" + pMinutes + " please enter in a valid time");
            }


        }


        return null;


    }


    private boolean validhours(int pHours) {
        if (pHours < 23 && pHours > 0) {

            return true;
        } else {
            return false;
        }
    }

    private boolean validminutes(int pMinutes) {
        if (pMinutes < 59 && pMinutes > 0) {
            return true;
        } else {
            return false;


        }
    }

    private boolean validmonth(int pMonth) {
        if (pMonth > 0 && pMonth < 13) {
            return true;
        } else
            return false;
    }
    private boolean validDay(int pDay) {
        if (pDay > 0 && pDay < 31) {
            return true;
        } else {
            return false;
        }
    }

    private boolean time(TimeOfDay now, TimeOfDay then) {

        if (
                now.getmDay() - then.getmDay() != 0 ||
                now.getmMonth() - then.getmMonth() != 0 ||
                now.getMhour() - then.getMhour() != 0 ||
                now.getmMinutes() - then.getmMinutes() != 0) {


            monthDifference = (Math.abs(now.getmMonth()-then.getmMonth()));

            hourDifference = (Math.abs(now.getMhour() - then.getMhour()));

            minDifference = (Math.abs(now.getmMinutes() - then.getmMinutes()));

            dayDifference = (Math.abs(now.getmDay()-then.getmDay()));

            return true;

        } else {

                System.out.println(">> Same Times");
                return false;
        }



    }

}



