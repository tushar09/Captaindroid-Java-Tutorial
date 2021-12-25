package stremSort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamSortStringList {

    public static void main(String [] args){

        List<String> items = Arrays.asList("0", "0", "9", "C", "A", "P", "T", "A", "I", "N", "D", "R", "O", "I", "D");

        // now sort the list
        List<String> sortedItems = items
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedItems);
    }
}
