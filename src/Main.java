import animals.*;
import sun.awt.geom.AreaOp;

import java.lang.reflect.Method;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {0,2,5,220,221,77,500,13,300,6,500,7};
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        DaysToWeekend daysToWeekend = new DaysToWeekend();
        System.out.println("Count of numbers in a range = "+ MyMath.myMath(2,222,numbers));
        if (day==Calendar.SUNDAY){
            System.out.println("Последний день");
        }
        else {
            System.out.println("До конца недели осталось: "+ daysToWeekend.getDaysToEndOfWeek(day));
        }
        Labrador dog1 = new Labrador("Reks");
        System.out.println(dog1.to_String());
        dog1.talk();

        Siam cat1 = new Siam("Boris");
        System.out.println(cat1.to_String());
        cat1.sleep();
        cat1.talk();
        cat1.awake();
        cat1.talk();

        Poodle dog2 = new Poodle("Reks");
        System.out.println(dog2.to_String());
        dog2.talk();
        Pers cat2 = new Pers("Boris");
        System.out.println(cat2.to_String());
        cat2.talk();
        System.out.println("equals? "+cat1.equals(cat2));
    }
}
