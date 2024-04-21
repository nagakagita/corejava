import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicateAndComposition {

    public static void main(String args[]){
        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        Integer counter =1;
        Predicate<String> startPredicate = str -> str.startsWith("S");
        Predicate<String> lengthPredicate = str -> str.length() >= 5;
       // names.stream().filter(startPredicate.and(lengthPredicate)).forEach(System.out::println);
        names.stream().filter(str -> str.startsWith("S")).filter(str -> str.length() >= 5).forEach(System.out::println);
        Map<Integer,String> mylistMap = names.stream().collect(Collectors.toMap(name->name.length(), name->name));
        mylistMap.forEach((k,v)->{
            System.out.println(k +" : "+v);
        });
    }
}
