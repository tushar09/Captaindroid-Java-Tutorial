import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamFilter {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "mango", "coconut", "guava");

        List<String> filtered = list.stream()            //Convert to stream
                .filter(line -> !"coconut".equals(line)) //remove coconut
                .filter(line -> !"mango".equals(line))   //remove mango
                .collect(Collectors.toList());           //convert the stream to list

        for (int i = 0; i < filtered.size(); i++) {
            System.out.println(filtered.get(i));
        }
    }
}
