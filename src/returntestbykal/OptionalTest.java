package returntestbykal;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class OptionalTest {

    public static Optional<Character> getNonRepeatedCharacterOpt(String str) {
        Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!countCharacters.containsKey(c)) {
                countCharacters.put(c, 1);
            } else {
                countCharacters.put(c, countCharacters.get(c) + 1);
            }
        }
        // As LinkedHashMap maintains insertion order, first character with
        // count 1 should return first non-repeated character
        for (Map.Entry<Character, Integer> e : countCharacters.entrySet()) {
            if (e.getValue() == 1)
                return Optional.of(e.getKey());
        }
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {
        Character c=getNonRepeatedCharacter("SASASP");
        System.out.println("Non repeated character is :"+c.toString());
        Optional<Character> opCh = getNonRepeatedCharacterOpt("SASAS");
        if (opCh.isPresent())
            System.out.println("Non repeated character is :" + opCh.toString());
        else {
            System.out.println("No non repeated character found in String");

        }
    }

    private static Character getNonRepeatedCharacter(String sasas) {
        AtomicReference<Character> ch = new AtomicReference<>();
        char[] charArray = sasas.toCharArray();
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        for(int i=0;i<charArray.length; i++)
        {
            if(charMap.containsKey(charArray[i])){
                charMap.put(charArray[i],charMap.get(charArray[i])+1);
            }else{
                charMap.put(charArray[i],1);
            }
        }
        charMap.forEach((key,value)->{
            if(value == 1){
                ch.set(key);
            }
        });
        return ch.get();
    }
}
