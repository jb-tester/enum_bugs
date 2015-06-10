package a.b.c;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by irina on 6/10/2015.
 */
public class TestBar {

    public static void main(String[] args) {
        Bar.getB1().setAaa(10);
        Bar.getB2().setAaa(20);
        Bar.getB3().setAaa(30);

        for (Bar s : Bar.values())
        {System.out.println(s.getAaa());
        }
        EnumSet<Bar> b1 = EnumSet.of(Bar.B4);
        EnumSet<Bar> bars = EnumSet.allOf(Bar.class);
        for (Bar bar : bars) {
            System.out.println("bar = " + bar);
        }
    }
}
