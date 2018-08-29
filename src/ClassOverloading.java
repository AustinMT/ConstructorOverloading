import java.util.Scanner;

public class ClassOverloading {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a time seperate the hour and minutes with a space");
        TimeOfDay now = new TimeOfDay(keyboard.nextInt(),keyboard.nextInt());

        System.out.println(now.getMhour() +": "+ now.getmMinutes());


    }

}
