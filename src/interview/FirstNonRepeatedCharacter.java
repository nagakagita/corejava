package interview;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        /*System.out.println("  Please  enter  the  input  string  :");
        Scanner in = new Scanner(System.in);    // read from System input
        String input = in.nextLine();*/
        String input = "interview";
        Character firstNonRepeatedChar = logic(input);
        System.out.println("The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
       // in.close();
    }

    private static Character logic(String input) {
        Character result =  input.chars()           // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                .map(entry -> entry.getKey())              // get the keys of EntrySet
                .findFirst().get();                        // get the first entry from the keys

        System.out.println("oput:: "+input.chars()           // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                        .collect(Collectors.toList()).get(0).getKey()
                /*.map(entry -> entry.getKey())              // get the keys of EntrySet
                .findFirst().get()*/
        );
        List<Map.Entry<Character, Long>> oput = input.chars()           // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                .collect(Collectors.toList());
        return result;
    }
}
