package returntestbykal;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;

    public class IntSummaryStatisticsDemo {
        public static void main(String[] args) {
            IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
            List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
            Iterator<Integer> iterator = list.listIterator();
            while (iterator.hasNext()) {
// Add the integers to the IntSummaryStatistics object
                intSummaryStatistics.accept(iterator.next());
// Use various methods to obtain the data

                System.out.println("The count of values is " + intSummaryStatistics.getCount());

                System.out.println("The average of values is " + intSummaryStatistics.getAverage());

                System.out.println("The sum of values is " + intSummaryStatistics.getSum());

                System.out.println("The maximum of values is " + intSummaryStatistics.getMax());

                System.out.println("The minimum of values is " + intSummaryStatistics.getMin());

                System.out.println("The string representation is");
                System.out.println(intSummaryStatistics.toString());
// IntSummaryStatistics{count=5, sum=150, min=10, average=30.000000, max=50}
            }
        }
    }
