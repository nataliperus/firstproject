//import com.sun.java.util.jar.pack.Package;
import myMath.*;
import animals.*;

//import sun.awt.geom.AreaOp;

import java.lang.reflect.Method;
import java.util.Calendar;

import static java.util.Objects.isNull;
import static myMath.MyMath.myMath;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {0,2,5,220,221,77,500,13,300,6,500,7};
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        DaysToWeekend daysToWeekend = new DaysToWeekend();
        System.out.println("Numers-in-Range--------------------------------------------");
        System.out.println("Count of numbers in a range = "+ myMath(2,222,numbers));
        System.out.println("Days-to-End-Week-------------------------------------------");
        if (day==Calendar.SUNDAY){
            System.out.println("Последний день");
        }
        else {
            System.out.println("До конца недели осталось: "+ daysToWeekend.getDaysToEndOfWeek(day));
        }
        System.out.println("Animals----------------------------------------------------");
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

        Labrador dog3 = new Labrador("Reks");
        System.out.println(dog3.to_String());

        System.out.println("Is cat1 equal to cat2? "+cat1.equals(cat2));

        System.out.println("Is dog3 equal to dog1? "+dog3.equals(dog1));

        Bear bear = new Bear();
        bear.talk();
        Cow cow = new Cow("Buryonka");
        System.out.println(cow.to_String());
        cow.talk();
        Domesticated[] annototations =cow.getClass().getAnnotationsByType(Domesticated.class);
        for (Domesticated domesticated: annototations) {
            System.out.println(domesticated.annotationType());
            System.out.println(cow.getClass().getName() + " is "+ (domesticated.value().isEmpty()? "not domesticated":"domesticated"));
        }
    }
}
