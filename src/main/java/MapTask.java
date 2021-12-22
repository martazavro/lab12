import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> array) {
        return array.stream().filter(x -> x.matches("\\d+")).
                map(x -> Integer.parseInt(x)).
                collect(Collectors.toList());
    }
}