import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public List <String> flattingStrings(List<String> flatting) {
        return flatting.stream().flatMap(x -> x.chars().mapToObj(i -> (String.valueOf((char) i)))).collect(Collectors.toList());
    }
}