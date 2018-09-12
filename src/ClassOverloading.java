import java.util.Scanner;


public class ClassOverloading {
    private TimeOfDay now;
    private TimeOfDay then;
    int hourDifference;
    int minDifference;

    public static void main(String[] args) {
        ClassOverloading classoverloading = new ClassOverloading();
        classoverloading.init();


    }

    public void init() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a time with an hour and minutes");
        now = setTimeOfDay(keyboard, now);
        System.out.println("\nSet your second set of time of hours and minutes\n");
        then = setTimeOfDay(keyboard, then);
        System.out.println("First Set of hours & minutes = "+now.getMhour() + ":" + now.getmMinutes());
        System.out.println("Second Set of hours & minutes = "+then.getMhour() + ":" + then.getmMinutes());

        if(time(now,then)) {
            System.out.println("\n The time difference is " + hourDifference + ":" + minDifference);
        }
        else{
            System.out.println("You gave the same times");
        }


    }

    public TimeOfDay setTimeOfDay(Scanner pkeyboard, TimeOfDay now) {
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter The Hour");
            int pHours = pkeyboard.nextInt();
            System.out.println("Enter The Minutes");
            int pMinutes = pkeyboard.nextInt();
            if (validhours(pHours) && validminutes(pMinutes)) {
                now = new TimeOfDay(pHours, pMinutes);
                valid = true;
                return now;
            } else {
                System.out.println("You have entered an invalid time:"
                        + pHours + ":" + pMinutes + " please enter in a valid time");
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

    private boolean time(TimeOfDay now, TimeOfDay then) {

        if (now.getMhour() - then.getMhour() != 0 || now.getmMinutes() - then.getmMinutes() != 0) {

            hourDifference = (Math.abs(now.getMhour() - then.getMhour()));

            minDifference = (Math.abs(now.getmMinutes() - then.getmMinutes()));
            return true;

        } else {

                System.out.println("This should not be happening");
                return false;
        }



    }

}



