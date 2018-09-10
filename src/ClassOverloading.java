import sun.util.resources.cldr.cs.CalendarData_cs_CZ;

import java.sql.Time;
import java.util.Scanner;

public class ClassOverloading {
    private TimeOfDay now;
    private TimeOfDay then;

    public static void main(String[] args) {
        ClassOverloading classoverloading = new ClassOverloading();
        classoverloading.init();


    }

    public void init() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a time seperate the hour and minutes with a space");
        now = setTimeOfDay(keyboard, now);
        then = setTimeOfDay(keyboard, then);
        System.out.println(now.getMhour() + ":" + now.getmMinutes());
        System.out.println(then.getMhour() + ":" + then.getmMinutes());
        Calc TimeEqual = new Calc(this.then,this.now);
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

            System.out.println("\nSet your second time of day \n");



            }



        return null;


    }


    private boolean validhours (int pHours){
        if (pHours < 23 && pHours > 0) {

            return true;
        } else {
            return false;
        }
    }
    private boolean validminutes (int pMinutes) {
        if (pMinutes < 59 && pMinutes > 0) {
            return true;
        }
        else {
            return false;




        }


        }

    }



