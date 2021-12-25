import java.util.Arrays;
import java.util.List;

public class Java8StreamFilterAndMap {

    public static void main(String[] args) {

        List<Toys> list = Arrays.asList(
                new Toys("Toy 1", 100, 1),
                new Toys("Toy 2", 200, 2),
                new Toys("Toy 3", 300, 3),
                new Toys("Toy 4", 400, 4)
        );


        String toyName = list.stream()                       // Convert to stream
                .filter(x -> "Toy 4".equals(x.getName()))    // Looking for Toy 4 only
                .map(Toys::getName)                          // map to only name
                .findAny()                                   // if exists, return Toy 4
                .orElse(null);                         // if not, return null


        System.out.println(toyName);
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
