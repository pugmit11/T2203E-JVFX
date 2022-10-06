package session7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalDate d1 = d.plusDays(5);
        System.out.println(d1);
        LocalDate d2 = d.plusYears(1);
        System.out.println(d2);
        LocalDate d3 = d.minusYears(1);
        System.out.println(d3);

        LocalDate t = LocalDate.of(2022,10,15);

        t.compareTo(y);
    }
}
