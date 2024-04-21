package returntestbykal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestPrime {
    public static boolean isPrime(int number) {
       // return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }
    public static void main(String[] args)
    {
        //System.out.println(printPrime(200));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19, 20,23);
        // Prime number
        System.out.println(numbers.stream()
                .filter(TestPrime::isPrime)
                .collect(Collectors.toList()));

    }
}

//to find the given number is prime or not
/*
public class Main {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
 */
