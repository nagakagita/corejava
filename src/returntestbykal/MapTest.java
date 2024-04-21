package returntestbykal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList); //prints [1, 2, 3, 4]
        intStream = Stream.of(1, 2, 3, 4); //stream is closed, so we need to create it again
        Map<Integer, Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i + 10));
        System.out.println("intMap" + intMap);
        // date content test
        LocalDate date1 = LocalDate.now();
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 11);
        LocalDate secondFriday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        //print secondFriday
        System.out.println("first year:: "+firstInYear);
        System.out.println("second friday:: "+secondFriday);
    }
}
