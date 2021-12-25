package stremSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamSortCustomObjectDesc {

    public static void main(String [] args){

        List<Toys> toyItems = Arrays.asList(
                new Toys("Toy 1", 8200, 1),
                new Toys("Toy 2", 1234, 2),
                new Toys("Toy 3", 56, 3),
                new Toys("Toy 4", 87234, 4)
        );

        // now sort the list by price
        List<Toys> sortedItemsByPrice = toyItems
                .stream()
                .sorted(Comparator.comparingInt(Toys::getPrice).reversed())
                .collect(Collectors.toList());

        System.out.println("sorted by price in descending order\n________________________________");

        sortedItemsByPrice.forEach(System.out::println);

        System.out.println("\nsorted by name in descending order\n________________________________");

        // now sort the list by price
        List<Toys> sortedItemsByName = toyItems
                .stream()
                .sorted(Comparator.comparing(Toys::getName).reversed())
                .collect(Collectors.toList());

        sortedItemsByName.forEach(System.out::println);
    }

    static class Toys {

        private String name;
        private int price;
        private int weight;

        public Toys(String name, int price, int weight) {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Toys{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", weight=" + weight +
                    '}';
        }
    }
}
