import java.util.*;

public class Main {
    public static void main(String[] args) {
        MapTask map = new MapTask();
        System.out.println(map.mapping(Arrays.asList("10", "20", "30")));

        FlattingTask flatting = new FlattingTask();
        System.out.println(flatting.flattingStrings(Arrays.asList("marta", "smile", "58")));

        FizzBuzzTask fizzBuzz = new FizzBuzzTask();
        System.out.println(fizzBuzz.fizzBuzzIt(15));

        GroupWordsTask groupWords = new GroupWordsTask();
        System.out.println(groupWords.groupIt(Arrays.asList("bonjour", "marta", "smile")));
    }
}