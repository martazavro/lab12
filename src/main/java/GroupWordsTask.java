import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {

    private static Integer transform(Map.Entry<Character, List<String>> toTransform) {
        List<String> values = toTransform.getValue();
        Character key = toTransform.getKey();
        int num = 0;
        for (String word : values) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == key) num++;
            }
        }
        return num;
    }
    public static Map<Character, Integer> groupIt(List<String>values){
        Set<Map.Entry<Character, List<String>>> map = values
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList())).entrySet();
        return map.stream().collect(Collectors.toMap(Map.Entry::getKey, GroupWordsTask::transform));
    }
}