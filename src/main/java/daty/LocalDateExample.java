package daty;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * Polecane klasy do używania dat: LocalTime, LocalDate, LocalDateTime, Instant i inne z javy 8.
 * Do okresów czasu można wykorzystać klasy Duration, Period.
 */
public class LocalDateExample {

    public static void main(String[] args) {
        //Stworzenie obiektu LocalDate z dzisiejsza data
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //Jutro
        LocalDate tommorow = LocalDate.now().plusDays(1);
        System.out.println(tommorow);

        //Dowolna data
        LocalDate localDate = LocalDate.of(2000, 4, 13);
        System.out.println(localDate);

        Period period = Period.between(localDate, now);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        //Czy jedna data jest po drugiej
        System.out.println(localDate.isAfter(now));
    }

}
